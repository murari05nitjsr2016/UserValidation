package com.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation{
    public abstract void Validation(String input);

}
public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user Registration prog");
        Validation vFname =(fName) ->{
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(fName);
            boolean matchFound = matcher.find();
            if(matchFound)
            {
                System.out.println("First Name Is Valid");
            }
            else {
                System.out.println("First Name Is Not Valid");
            }

        };
        vFname.Validation("Murari");
        Validation vLname =(lName) ->{
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{3,}$");
            Matcher matcher = pattern.matcher(lName);
            boolean matchFound = matcher.find();
            if(matchFound)
            {
                System.out.println("Last Name Is Valid");
            }
            else {
                System.out.println("First Name Is Not Valid");
            }

        };
        vLname.Validation("Kumar");
    }

}


