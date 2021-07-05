package com.example.resume.Exception;

import com.example.resume.Exception.CustomException.ResumeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException exception){
        Map<String ,String> validationErrors = new HashMap<>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return new ResponseEntity<Object>(validationErrors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResumeNotFoundException.class)
    public ResponseEntity<?> resumeCustomExceptionHandler(ResumeNotFoundException e){
        return new ResponseEntity<>(e.getMessage() , HttpStatus.NOT_FOUND);

    }



}
