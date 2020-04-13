package org.example.spring.cloud.discovery.consumerservice.controller;

import org.example.spring.cloud.discovery.consumerservice.externalservice.ProducerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ProducerFeignClient producerService;

    @RequestMapping("/hi")
    public String hi() {
        return "Greetings from Producer: [" + producerService.hello() + "]";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "Darewell from Producer: [" + producerService.goodbye() + "]";
    }

    @RequestMapping("/chat")
    public String chat() {
        return "This is endpoint is from consumer service";
    }

}
