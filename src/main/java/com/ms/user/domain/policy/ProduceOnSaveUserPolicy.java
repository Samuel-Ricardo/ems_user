package com.ms.user.domain.policy;

import com.ms.user.domain.entity.User;

import java.util.concurrent.Callable;
import java.util.function.Function;

public interface ProduceOnSaveUserPolicy {
    public void apply(Callable<User> save) throws Exception;
}
