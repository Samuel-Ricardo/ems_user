package com.ms.user.domain.policy;

import com.ms.user.domain.entity.User;

public interface ProduceOnSaveUserPolicy {
    public void execute(User user);
}
