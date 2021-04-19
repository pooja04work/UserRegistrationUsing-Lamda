package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidator{
    /**
     * @var NAME_PATTERN contain correct pattern for first name and last name.
     * @var EMAIL_PATTERN contain correct pattern for email.
     * @var PHONE_NUMBER_PATTERN contain correct pattern for phone number.
     * @var PASSWORD_PATTERN contain correct pattern for password.
     */
    final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
        final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
        final String PHONE_NUMBER_PATTERN = "[0-9]{2}[\\s][0-9]{10}$";
        final String PASSWORD_PATTERN = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        Scanner scanner = new Scanner(System.in);
    /**
     * here we use the lamda function to check the pattern and input value matched or not.
     * @return boolean result to UserInterface.
     */
     UserInterface userInterface = (pattern, input) -> {
                                                            boolean result = Pattern.matches(pattern, input);
                                                            return result;
                                                            };
     /**
     * This method is used validating userinput firstname.
     * @param NAME_PATTERN hold the correct pattern to match with the input.
     */

     public void FirstNameCheck() {
            System.out.println("enter FirstName");
            String firstName = scanner.nextLine();
            try {
                if (!userInterface.ChackInputvalidation(NAME_PATTERN, firstName))
                    throw new UserDefineException("invalid first name");
                else
                    System.out.println("congratulation!!You follow the correct pattern.\nfirstname = " + firstName);
            } catch (UserDefineException e) {
                System.out.println(e.errorMessage);
                FirstNameCheck();
            }
        }
    /**
     * This method is used validating userinput lastname.
     * @param NAME_PATTERN hold the correct pattern to match with the input.
     */
     public void LastNameCheck() {
            System.out.println("enter LastName");
            String lastName = scanner.nextLine();
                try {
                    if (!userInterface.ChackInputvalidation(NAME_PATTERN, lastName))
                        throw new UserDefineException("invalid last name");
                    else
                        System.out.println("congratulation!!You follow the correct pattern.\nlastname = " + lastName);
                } catch (UserDefineException e) {
                    System.out.println(e.errorMessage);
                    LastNameCheck();
                }
        }
    /**
     * This method is used validating userinput email.
     * @param EMAIL_PATTERN hold the correct pattern to match with the userinput.
     */
     public void EmailCheck() {
            System.out.println("enter Email");
            String email = scanner.nextLine();
                try {
                    if (!userInterface.ChackInputvalidation(EMAIL_PATTERN, email))
                        throw new UserDefineException("invalid email");
                    else
                        System.out.println("congratulation!!You follow the correct pattern.\nemail = " + email);
                } catch (UserDefineException e) {
                    System.out.println(e.errorMessage);
                    EmailCheck();
                }
            }
    /**
     * This method is used validating userinput phoneNo.
     *
     * @param PHONE_NUMBER_PATTERN hold the correct pattern to match with the userinput.
     */

     public void PhoneNumberCheck() {
            System.out.println("enter PhoneNumber");
            String phoneNumber = scanner.nextLine();
            try {
                if (!userInterface.ChackInputvalidation(PHONE_NUMBER_PATTERN, phoneNumber))
                    throw new UserDefineException("invalid phone number");
                else
                    System.out.println("congratulation!!You follow the correct pattern.\nphonenumber = " + phoneNumber);
            } catch (UserDefineException e) {
                System.out.println(e.errorMessage);
                PhoneNumberCheck();
            }
     }

    /**
     * This method is used validating userinput password.
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @param PASSWORD_PATTERN hold the correct pattern to match with the userinput.
     */

     public void PasswordCheck() {
            System.out.println("enter password");
            String password = scanner.nextLine();
            try {
                if (!userInterface.ChackInputvalidation(PASSWORD_PATTERN, password))
                    throw new UserDefineException("invalid password");
                else
                    System.out.println("congratulation!!You follow the correct pattern.\npassword = " + password);
            } catch (UserDefineException e) {
                System.out.println(e.errorMessage);
                PasswordCheck();
            }
     }
}
