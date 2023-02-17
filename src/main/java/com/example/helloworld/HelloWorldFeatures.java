package com.example.helloworld;

import com.azure.spring.cloud.feature.manager.FeatureManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldFeatures {
    private FeatureManager featureManager;

    public HelloWorldFeatures(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/feature")
    public String getFeature() {
        //     Retrieve the value of the "Beta" feature flag
        boolean myFeatureEnabled = featureManager.isEnabledAsync("featureManagement.Beta").block();
//        boolean myFeatureEnabled = featureManager.isEnabledAsync("Beta").block();
        if (myFeatureEnabled) {
            return "My feature is enabled!";
        } else {
            return "My feature is disabled.";
//            return "My feature is not there yet.";
        }

    }
}

    
    
    

