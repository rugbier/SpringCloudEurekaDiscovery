package org.example.spring.cloud.discovery.consumerservice.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("producerresource")
public interface ProducerFeignClient {
    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/goodbye")
    String goodbye();
}
