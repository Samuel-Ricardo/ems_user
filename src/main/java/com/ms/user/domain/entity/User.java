package com.ms.user.domain.entity;

import com.ms.user.domain.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.UUID;

@Data @Builder
@Entity @Table(name = "TB_USERS")
@AllArgsConstructor @NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    private String name;
    @Column(unique = true)
    private String email;

    public static User of(UserDTO dto) {
        return User
                .builder()
                .email(dto.email())
                .name(dto.name())
                .build();
    }
}
