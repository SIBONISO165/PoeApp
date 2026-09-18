/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poeapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        Login instance = new Login("Kyle", "Tshofs", "Kyl_2", "Sibo@30", "+27632610239");
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredPassword = "";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean isLogged = true;
        Login instance = new Login();
        String expResult = "Welcome" + "firstName" +"," + "lastName"+"it is great to see you again";
        String result = instance.returnLoginStatus(isLogged);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsernameMessage method, of class Login.
     */
    @Test
    public void testGetUsernameMessage() {
        System.out.println("getUsernameMessage");
        Login instance = new Login("Kyle", "Tshofs", "Kyl_2", "Sibo@30", "+27632610239");
        String expResult = "Username successfully captured";
        String result = instance.getUsernameMessage();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPasswordMessage method, of class Login.
     */
    @Test
    public void testGetPasswordMessage() {
        System.out.println("getPasswordMessage");
        Login instance = new Login("Kyle", "Tshofs", "Kyl_2", "Sibo@430", "+27632610239");
        String expResult = "Password successfully captured";
        String result = instance.getPasswordMessage();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCellMessage method, of class Login.
     */
    @Test
    public void testGetCellMessage() {
        System.out.println("getCellMessage");
        Login instance = new Login("Kyle", "Tshofs", "Kyl_2", "Sibo@430", "+27632610239");
        String expResult = "Cell phone number is successfuly added";
        String result = instance.getCellMessage();
        assertEquals(expResult, result);
       
    }
    
}
