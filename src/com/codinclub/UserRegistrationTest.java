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
}
