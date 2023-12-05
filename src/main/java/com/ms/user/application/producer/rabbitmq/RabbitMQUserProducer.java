package com.ms.user.application.producer.rabbitmq;

import com.ms.user.domain.dto.EmailDTO;
import com.ms.user.domain.entity.User;
import com.ms.user.domain.producer.UserProducer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class RabbitMQUserProducer implements UserProducer {

    @Autowired
    private RabbitTemplate rabbit;


    //@Value("${broker.queue.email.name}")
    private String routingKey = "default.email";

    @Override
    public void publishMessageEmail(User user) {

        var email = EmailDTO.builder()
                .userId(user.getUserId())
                .emailTo(user.getEmail())
                .subject("Registration completed successfully! :D")
                .text("Be Welcome " + user.getName() +"! \n Thank you for registering, enjoy all the features of our platform now! :D")
                .build();

        rabbit.convertAndSend("", routingKey, email);
    }
}
