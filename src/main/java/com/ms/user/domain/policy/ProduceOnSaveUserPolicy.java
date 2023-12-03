package com.ms.user.domain.policy;

import com.ms.user.domain.entity.User;

import java.util.concurrent.Callable;

public interface ProduceOnSaveUserPolicy {
    public User apply(Callable<User> save) throws Exception;
}
