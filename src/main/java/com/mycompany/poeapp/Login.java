/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poeapp;

/**
 *
 * @author Student
 */
public class Login {
    String firstName, lastName, username,password, cellPhoneNumber;
  public Login(){
  
      this.firstName = "firstName";
      this.lastName = "lastName";
      this.username = "";
      this.password = "";
      this.cellPhoneNumber = "";
                   
  }
    
     
    public Login(String firstName, String lastName, String username, String password, String cellNumber){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellNumber;
    }
    
    public boolean checkUserName(){
        if (username.contains("Sibo_") && username.length() <=5){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkPasswordComplexity(){
        if (password.length()>=8 && password.matches(".*[A-Z].*")&& password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkCellPhoneNumber(){
        if (cellPhoneNumber.matches("^\\+27[0-9]{9}$")){
            return true;
        }else{
            return false;
        }
    }
    
    public String registerUser(){
         if (!checkUserName()){
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        }
        if (!checkPasswordComplexity()){
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special letter";
        }
        if (!checkCellPhoneNumber()){
            return "Cellphone number is incorectly formatted or does not contain an South African code, please correct the number and try again";
        }
        return "Welcome" + firstName +"," + lastName + "it is great to see you.";
        }
    public boolean loginUser(String enteredUsername, String enteredPassword){
        if (username.equals(enteredUsername) &&this.password.equals(enteredPassword)){
            return true;
        }else{
            return false;
        }
    }
    public String returnLoginStatus(boolean isLogged){
        if (isLogged){
            return "Welcome" + firstName +"," + lastName +"it is great to see you again";
        }else{
            return"Username or password is incorrect, please try again";
        }
    }
    public String getUsernameMessage(){
        if (checkUserName()){
            return "Username successfully captured";
        }else{
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        }
    }
    public String getPasswordMessage(){
        if (checkPasswordComplexity()){
            return "Password successfully captured";
        }else{
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special letter";
        }
    }
    public String getCellMessage(){
        if (checkCellPhoneNumber()){
            return "Cell phone number is successfuly added";
        }else{
            return "Cellphone number is incorectly formatted or does not contain an South African code, please correct the number and try again";
        }
    }
}
