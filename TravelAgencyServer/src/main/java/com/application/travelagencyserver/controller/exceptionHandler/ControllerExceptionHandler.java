package com.application.travelagencyserver.controller.exceptionHandler;

import com.application.travelagencyserver.dto.exception.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionResponseDTO> handleException(Exception exception) {
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                exception.getClass().getSimpleName()
        );
        return new ResponseEntity<>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
