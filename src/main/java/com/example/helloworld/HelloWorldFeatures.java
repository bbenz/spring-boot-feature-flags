package com.example.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.cloud.feature.manager.FeatureManager;

@RestController
@ConfigurationProperties("controller")
public class HelloWorldFeatures {
    
    //@Autowired
    public FeatureManager featureManager;

    public HelloWorldFeatures(FeatureManager featureManager) {
        this.featureManager = featureManager;
     }

    @GetMapping("/feature")
    public String getFeature() {
    //  Retrieve the value of the "Beta" feature flag
        boolean myFeatureEnabled = featureManager.isEnabledAsync("Beta").block();
        if (myFeatureEnabled) {
            return "My feature is enabled!";
        } else {
            return "My feature is disabled.";
        }
    }

}
