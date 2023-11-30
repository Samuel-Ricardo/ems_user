package com.ms.user.domain.producer;

import com.ms.user.domain.entity.User;

public interface UserProducer {
    public void publishMessageEmail(User user);
}
