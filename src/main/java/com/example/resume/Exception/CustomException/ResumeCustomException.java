package com.example.resume.Exception.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResumeCustomException extends RuntimeException{

    public ResumeCustomException (String message){
        super(message);
    }


}
