package com.in28minute.rest.webservices.webservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDate;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CustomeExceptionForSingleURI extends RuntimeException{
    private LocalDate timestamp;
    private String message;
    private String details;

    public CustomeExceptionForSingleURI(LocalDate timestamp, String message, String details)
    {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }


    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
