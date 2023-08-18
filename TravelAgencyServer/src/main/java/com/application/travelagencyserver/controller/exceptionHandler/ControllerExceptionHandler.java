package com.application.travelagencyserver.controller.exceptionHandler;

import com.application.travelagencyserver.dto.exception.ExceptionResponseDTO;
import com.application.travelagencyserver.exception.JwtAuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionResponseDTO> handleException(JwtAuthenticationException exception){
        return provideResponseEntity(HttpStatus.FORBIDDEN,
                                           exception.getMessage(), exception.getClass().getSimpleName());
    }

    @ExceptionHandler
    public ResponseEntity<ExceptionResponseDTO> handleException(Exception exception) {
        return provideResponseEntity(HttpStatus.BAD_REQUEST,
                                           exception.getMessage(), exception.getClass().getSimpleName());
    }

    private ResponseEntity<ExceptionResponseDTO> provideResponseEntity(HttpStatus status,
                                                                       String message, String simpleName) {
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(status.value(), message, simpleName);

        return new ResponseEntity<>(responseDTO, status);
    }
}
