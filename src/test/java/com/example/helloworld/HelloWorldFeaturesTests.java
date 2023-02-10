package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.cloud.azure.appconfiguration.enabled=false")
class HelloWorldFeaturesTests {

    @Autowired
    private HelloWorldFeatures helloWorldFeatures;

    @Test
    void contextLoads() {
        // to ensure that controller is getting created inside the application context
        //assertNotNull(helloWorldController);
    }

}
