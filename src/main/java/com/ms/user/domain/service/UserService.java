package com.ms.user.domain.service;

import com.ms.user.domain.dto.UserDTO;
import com.ms.user.domain.entity.User;

import java.util.List;

public interface UserService {
    public User save (User user) throws Exception;
    public List<User> getAll();
}
