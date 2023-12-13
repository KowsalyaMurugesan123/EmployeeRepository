package com.project.SpringProject.ExceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
       public  ResponseEntity<String> handleException(Exception e)
    {
       return  new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(Exception e)
    {
        return  new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
    }
}

