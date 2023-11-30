package com.ms.user.application.policy;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.policy.ProduceOnSaveUserPolicy;
import org.springframework.stereotype.Component;

@Component
public class ProduceOnSaveUserPolicyImpl implements ProduceOnSaveUserPolicy {
    @Override
    public void execute(User user) {
        
    }
}
