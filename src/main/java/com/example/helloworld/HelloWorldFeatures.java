package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.azure.spring.cloud.feature.manager.FeatureManager;

//@RestController
@Controller
@ConfigurationProperties
//@ConfigurationProperties("controller")



public class HelloWorldFeatures {

@Autowired
private FeatureManager featureManager;

//@Autowired
//FeatureManager featureManager;

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
//            return "My feature is not thereyet.";
        }

}
}

    
    
    

