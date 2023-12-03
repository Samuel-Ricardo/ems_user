package com.ms.user.application.service;

import com.ms.user.application.usecase.SaveUserUseCase;
import com.ms.user.domain.entity.User;
import com.ms.user.domain.policy.ProduceOnSaveUserPolicy;
import com.ms.user.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary @Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ProduceOnSaveUserPolicy produceOnSaveUserPolicy;
    private final SaveUserUseCase save;

    @Override
    public User save(User user) throws Exception {
        return produceOnSaveUserPolicy.apply(() -> save.execute(user));
    }
}
