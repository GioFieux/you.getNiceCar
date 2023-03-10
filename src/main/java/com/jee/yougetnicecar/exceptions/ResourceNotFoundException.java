package com.jee.yougetnicecar.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serieVersionUID = 1L;

    public ResourceNotFoundException() {}
    public ResourceNotFoundException(String message) {
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
