package org.fai.study.demo_producer.controllers;

import org.fai.study.demo_producer.services.RabbitMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OrderController {
    @Autowired
    RabbitMqService rabbitMqService;
    @PostMapping("/send")
    public String SendMessage(@RequestBody String message){
        rabbitMqService.sendMessage(message);
        return "Send Message";
    }
}
