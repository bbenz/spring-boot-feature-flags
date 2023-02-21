# To run this app locally, a local variable is needed that connects to a Azure App COnfiguration Manager
# The variable is called "AZURE_APP_CONFIG_CONNECTION_STRING" and it should be set to the connection string of the App Configuration Manager
# export APP_CONFIGURATION_CONNECTION_STRING=''
# Run with docker run -p 8080:8080 -e APP_CONFIGURATION_CONNECTION_STRING spring-boot-docker 
# Access the app at http://localhost:8080/feature
#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /home/app/
COPY . /home/app/
RUN mvn clean package -DskipTests=true

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/spring-boot-docker-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]

# Leftover stage (things I want to keep from debugging) 
# WORKDIR /home/
# COPY --from=builder /home/app/target/spring-boot-docker-0.0.1-SNAPSHOT.jar /home/
# ENTRYPOINT [ "java", "-jar", "/home/spring-boot-docker-0.0.1-SNAPSHOT.jar", "--server.port=80" ]