package com.ms.user.domain.service;

import com.ms.user.domain.dto.UserDTO;
import com.ms.user.domain.entity.User;

public interface UserService {
    public User save (UserDTO user);
}
