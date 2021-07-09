package com.example.resume.Exception.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExperienceInvalidException extends RuntimeException {

    public  ExperienceInvalidException(String message){
        super(message);
    }
}
