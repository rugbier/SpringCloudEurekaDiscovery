package org.example.spring.cloud.discovery.producerresource.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController{

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String portNumber;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello from " + appName + " with port: " + portNumber;
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goorby from" + appName + " with port: " + portNumber;
    }
}

