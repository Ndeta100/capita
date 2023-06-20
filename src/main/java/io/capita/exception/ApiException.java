package io.capita.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
