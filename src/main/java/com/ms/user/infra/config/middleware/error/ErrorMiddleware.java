package com.ms.user.infra.config.middleware.error;

import com.ms.user.domain.dto.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorMiddleware {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleError(Exception e) {
        e.printStackTrace();
        return ResponseEntity.
                internalServerError().
                body(
                        new ErrorDTO(
                                e.getMessage(),
                                "https://http.cat/status/500"
                        )
                );
    }

}
