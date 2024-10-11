package org.fai.study.demo_producer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {
    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;
    @Value("${rabbitmq.routing_key}")
    private String routingKey;
    @Autowired
    RabbitTemplate rabbitTemplate;
    public void sendMessage(String message){
        rabbitTemplate.convertAndSend(exchangeName, routingKey,message);
    }
}
