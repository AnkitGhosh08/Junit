package com.codinclub;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName( String firstName){
        String Regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean LastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean Email(String email) {
        String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean MobileNumber(String mobileNumber) {
        String regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    public boolean Password(String password) {
        String regex = "^[0-9a-zA-Z!,@#$&*().]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
       return matcher.matches();
    }
}
