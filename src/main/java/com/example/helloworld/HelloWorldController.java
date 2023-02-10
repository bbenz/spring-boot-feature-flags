package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.cloud.feature.manager.FeatureManager;

@RestController
//@ConfigurationProperties("controller")
public class HelloWorldController {
    
    //@Autowired
    //public FeatureManager featureManager;

    //private FeatureManager featureManager;

    //public HelloWorldController(FeatureManager featureManager) {
    //    this.featureManager = featureManager;
    // }

    private final MessageProperties properties;

    public HelloWorldController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }

    @GetMapping("/hello")
    public String sayHey() {
        return "Hey.";
    }

    //@GetMapping("/feature")
    //public String getFeature() {
    //     Retrieve the value of the "Beta" feature flag
    //    boolean myFeatureEnabled = featureManager.isEnabledAsync("Beta").block();
    //    if (myFeatureEnabled) {
    //        return "My feature is enabled!";
    //    } else {
    //        return "My feature is disabled.";
    //    }
    //}

}
