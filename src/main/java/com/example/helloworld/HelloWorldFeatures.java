package com.example.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.cloud.feature.manager.FeatureManager;

@RestController
//@Controller
//@ConfigurationProperties("controller")
public class HelloWorldFeatures {
    private FeatureManager featureManager;

    public HelloWorldFeatures(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/feature")
    public String getFeature() {
        //     Retrieve the value of the "Beta" feature flag
//        boolean myFeatureEnabled = featureManager.isEnabledAsync("featureManagement.Beta").block();
//        boolean myFeatureEnabled = featureManager.isEnabledAsync("featureManagement.Beta").block();
//        if (myFeatureEnabled) {
    if(featureManager.isEnabledAsync("featureManagement.Beta").block()) {
    //if(featureManager.isEnabledAsync("Beta").block()) {
            return "My feature is enabled!";
        } else {
            return "My feature is disabled.";
//            return "My feature is not there yet.";
        }
    }
}

    
    
    

