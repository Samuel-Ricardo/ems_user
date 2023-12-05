package com.ms.user.application.policy;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.policy.ProduceOnSaveUserPolicy;
import com.ms.user.domain.producer.UserProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
public class ProduceOnSaveUserPolicyImpl implements ProduceOnSaveUserPolicy {

    @Autowired
    private UserProducer producer;

    @Override
    public User apply(Callable<User> save) throws Exception {
        var user = save.call();
        producer.publishMessageEmail(user);
        
        return user;
    }
}
