package org.fai.study.demo_consumer.configuration;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Value("${rabbitmq.queue.name}")
    public String queueName;
    @Value("${rabbitmq.exchange.name}")
    public String exchangeName;
    @Value("${rabbitmq.routing_key}")
    public String routingKey;
    @Bean
    public Queue queue(){
        return new Queue(queueName, true);
    }
    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(exchangeName);
    }
    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(exchange()).with(routingKey);
    }
}
