package com.codinclub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean actual = userRegistration.firstName("Ankit");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnFalse() {
        boolean actual = userRegistration.firstName("ankit");
        boolean exacted = false;
        Assertions.assertEquals(exacted, actual);
    }
    @Test
    public void givenLastName_whenValid_shouldReturnTrue(){
        boolean actual = userRegistration.LastName("Ghosh");
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void givenEmail_whenValid_shouldReturnTrue(){
        boolean actual = userRegistration.Email("ankit.ghosh@mail.com.in");
        boolean expected = true ;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void givenMobileNumber_whenValid_shouldReturnTrue() {
        boolean actual = userRegistration.MobileNumber("91 9912345670");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        boolean actual = userRegistration.Password("xyzAB@12");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}