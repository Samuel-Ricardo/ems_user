package com.ms.user.application.policy;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.policy.ProduceOnSaveUserPolicy;
import com.ms.user.domain.producer.UserProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
@RequiredArgsConstructor
public class ProduceOnSaveUserPolicyImpl implements ProduceOnSaveUserPolicy {

    final UserProducer producer;

    @Override
    public User apply(Callable<User> save) throws Exception {
        var user = save.call();
        producer.publishMessageEmail(user);
        
        return user;
    }
}
