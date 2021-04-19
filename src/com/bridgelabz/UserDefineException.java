package com.bridgelabz;

public class UserDefineException extends Exception {
    String errorMessage;
    public UserDefineException(String message) {
        this.errorMessage = message;
    }
}
