package com.example.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSiteController {

    private final WebSiteConfiguration configuration;

    public WebSiteController(WebSiteConfiguration configuration) {
        this.configuration = configuration;
    }

    @RequestMapping("/website-config")
    public WebSiteConfiguration retrieveWebSiteConfiguration() {
        return configuration;
    }
}
