package com.bus.mq.rabbitConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
 
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
    
    @Bean
    public TopicExchange topicExchange() {
    	return new TopicExchange("bus.mq.exchange");
    }
    
    @Bean
    public Binding topicBind() {
    	return BindingBuilder.bind(helloQueue()).to(topicExchange()).with("topic.routingkey.#");
    }

}
