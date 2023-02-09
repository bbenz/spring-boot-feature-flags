# Spring Boot 3 Hello World with Feature Flags

**This is a sample app that returns values from Feature flags **

> **Prerequisites:** Minimum **Spring Boot 3** and **Java 17**. 

## Building the Application

- **Using maven** <br/>``` mvn clean package```

## Running the Application

- **Using maven** <br/>``` mvn spring-boot:run```


> **Note:** To change the default port 8080, change the **server.port** in **application.properties** file under **src > main > resources**.

<br/>

**Send an HTTP GET request to '/hello' endpoint using any of the two methods**

- **Browser or REST client**
  <br/>```http://localhost:8080/hello```


- **cURL**
  <br/>```curl --request GET 'http://localhost:8080/hello'```


