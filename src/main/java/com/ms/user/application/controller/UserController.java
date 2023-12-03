package com.ms.user.application.controller;

import com.ms.user.domain.dto.UserDTO;
import com.ms.user.domain.entity.User;
import com.ms.user.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getAll());
    }

    public ResponseEntity<User> saveUser(
            @RequestBody
            @Valid UserDTO user
    ) throws Exception {
        return ResponseEntity.
                ok(service.save(User.of(user)));
    }

}
