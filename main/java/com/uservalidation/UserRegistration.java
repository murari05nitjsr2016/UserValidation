package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation{
    public abstract void Validation(String input);
  // public abstract void Validation1(String input);

}
public class UserRegistration {
    public static void main(String[] args) {

        System.out.println("Welcome to user Registration prog");

        Validation vFname = (fName) -> {
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(fName);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("First Name Is Valid");
            } else {
                System.out.println("First Name Is Not Valid");
            }

        };
        vFname.Validation("Murari");
        Validation vLname = (lName) -> {
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(lName);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Last Name Is Valid");
            } else {
                System.out.println("Last Name Is Not Valid");
            }

        };
        vLname.Validation("Kumar");


        Validation emailValidation = (email) -> {
            String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Valid email");
            } else {
                System.out.println("Invalid email");
            }
        };

        emailValidation.Validation("murario5nitJsr2016@gmail.com");
        Validation mobNoValidation = (mobNo) -> {
            String regex = ("^[1-9]{2}[\\s][6-9]{1}[0-9]{9}$");
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mobNo);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Valid mobile number");
            } else {
                System.out.println("Invalid mobile number");
            }
        };
        mobNoValidation.Validation("8709628464");
        Validation pwd1Validation=(pwd)-> {
            String regex = "[A-Z0-9a-z$%&*@!#]{8,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(pwd);
            boolean matchFound = matcher.find();
            if (matchFound) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        };
        pwd1Validation.Validation("jhg012@3#");



    }
}

