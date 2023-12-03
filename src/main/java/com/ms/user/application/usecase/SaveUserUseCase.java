package com.ms.user.application.usecase;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class SaveUserUseCase {

    private UserRepository repository;

    public User execute(User user) {
        return repository.save(user);
    }
}
