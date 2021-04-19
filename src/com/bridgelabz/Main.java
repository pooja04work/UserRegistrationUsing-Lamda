package com.bridgelabz;

public class Main {
    public static void main(String[] args){
        UserValidator userValidator = new UserValidator();
        userValidator.FirstNameCheck();
        userValidator.LastNameCheck();
        userValidator.EmailCheck();
        userValidator.PhoneNumberCheck();
        userValidator.PasswordCheck();

    }
}

