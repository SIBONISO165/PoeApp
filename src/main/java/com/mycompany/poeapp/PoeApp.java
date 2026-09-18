/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Registration");
        
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Please enter your username(must contain _ and <=5 characters): ");
        String username = scanner.nextLine();
        
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        
        System.out.println("Please enter your cellphone number(SA code e.g. +27632610239: ");
        String cellPhonenumber = scanner.nextLine();
        
        Login login = new Login (firstName, lastName, username, password, cellPhonenumber);
        
        System.out.println(login.getUsernameMessage());
        System.out.println(login.getPasswordMessage());
        System.out.println(login.getCellMessage());
        System.out.println(login.registerUser());
        
        if (login.checkUserName()&& login.checkPasswordComplexity()&& login.checkCellPhoneNumber()){
            System.out.println("===Login===");
            
            System.out.println("Please enter username");
            String loginUsername = scanner.nextLine();
            
            System.out.println("Please enter password");
            String loginPassword = scanner.nextLine();
            
            boolean loggedIn = login.loginUser(loginUsername, loginPassword);
            System.out.println(login.returnLoginStatus(loggedIn));
        }
        
    }
}
