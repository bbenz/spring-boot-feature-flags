package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.cloud.feature.manager.FeatureManager;

@RestController
public class HelloWorldFeatures {
    private FeatureManager featureManager;

    public HelloWorldFeatures(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/feature")
    public String getFeature()  {
    //     Retrieve the value of the "Beta" feature flag
    if(featureManager.isEnabledAsync("Beta").block()) {
            return "My DevNexus feature is enabled!";
        } else {
            return "My DevNezus feature is disabled.";
        }
    }
}

    
    
    

