package com.docker.example.demo;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String message;
    private String description;
    public ExceptionResponse(Date date, String message, String description) {
        this.date=date;
        this.message=message;
        this.description=description;
    }
}
