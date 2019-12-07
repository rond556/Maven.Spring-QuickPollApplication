package io.zipcoder.tc_spring_poll_application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {

    public ResourceNotFoundException(){
    }

    public ResourceNotFoundException(String message){
    }

    public ResourceNotFoundException(String message, Throwable cause){
    }
}
