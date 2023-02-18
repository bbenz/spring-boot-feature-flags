package com.example.helloworld;

import com.azure.spring.cloud.feature.manager.FeatureManagementConfigProperties;
import com.azure.spring.cloud.feature.manager.FeatureManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

   // @Bean
   // FeatureManager featureManager() {
   //     return new FeatureManager(new FeatureManagementConfigProperties());
   // }
}
