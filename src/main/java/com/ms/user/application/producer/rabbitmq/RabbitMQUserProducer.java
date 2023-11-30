package com.ms.user.application.producer.rabbitmq;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.producer.UserProducer;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQUserProducer implements UserProducer {
    @Override
    public void publishMessageEmail(User user) {
        
    }
}
