package com.crud.tasks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHttpErrorHandler extends ResponseEntityExceptionHandler {
    public ResponseEntity<Object> handleTaskNotFoundException(TaskNotFoundException exception) {
        return new ResponseEntity<>("Task with given id does not exist", HttpStatus.BAD_REQUEST);
    }
}
