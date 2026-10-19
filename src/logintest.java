package com.mycompany.prog5121_part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testCheckUserNameValid() {
        Login login = new Login();
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testCheckUserNameInvalid() {
        Login login = new Login();
        assertFalse(login.checkUserName("kyle!!!!!!"));
    }

    @Test
    public void testCheckPasswordComplexityValid() {
        Login login = new Login();
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testCheckPasswordComplexityInvalid() {
        Login login = new Login();
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testCheckCellPhoneNumberValid() {
        Login login = new Login();
        assertTrue(login.checkCellPhoneNumber("+27839668976"));
    }

    @Test
    public void testCheckCellPhoneNumberInvalid() {
        Login login = new Login();
        assertFalse(login.checkCellPhoneNumber("0839668976"));
    }

    @Test
    public void testLoginUserSuccess() {
        Login login = new Login();
        login.registerUser("John", "Doe", "j_doe", "Password@1", "+27839668976");
        assertTrue(login.loginUser("j_doe", "Password@1"));
    }

    @Test
    public void testLoginUserFailure() {
        Login login = new Login();
        login.registerUser("John", "Doe", "j_doe", "Password@1", "+27839668976");
        assertFalse(login.loginUser("j_doe", "WrongPass@1"));
    }
}
