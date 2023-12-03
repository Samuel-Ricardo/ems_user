package com.ms.user.application.usecase;

import com.ms.user.domain.entity.User;
import com.ms.user.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllUsersUseCase {

    @Autowired
    private UserRepository repository;

    public List<User> execute() {
        return repository.findAll();
    }

}
