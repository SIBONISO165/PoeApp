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
public class MessageTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
   
    
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Message instance = new Message ("+27632610239", "Hi Mike, can you join us for dinner tonight?", "123456789", 0);
        boolean expResult = true;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCheckReciptientCell() {
        System.out.println("checkReciptientCell");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        String expResult = "Cell phone number successfully captured.";
        String result = instance.checkReciptientCell();
        assertEquals(expResult, result);
      
    }

    
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        String expResult = "Message ready to send.";
        String result = instance.checkMessageLength();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?","0012345678",0);
        String expResult = "00:0:HITONIGHT";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        String choice = "Send Message";
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        String expResult = "Message succesfully sent.";
        String result = instance.sentMessage(choice);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        String expResult = "";
        String result = Message.printMessage();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        instance.storeMessage();
        java.io.File file = new java.io.File("storedMessages.json");
        assertTrue(file.exists());
        
    }

   
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?", "0012345678", 0);
        String expResult = "0012345678";
        String result = instance.getMessage();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        String expResult = "+27632610239";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
       
    }

  
    @Test
    public void testGetMessageText() {
        System.out.println("getMessageText");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?");
        String expResult = "Hi Mike, can you join us for dinner tonight?";
        String result = instance.getMessageText();
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?", "123456789", 0);
        String expResult = "12:0:HITONIGHT";
        instance.createMessageHash();
        String result = instance.getMessageHash();
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testGetMessageNumber() {
        System.out.println("getMessageNumber");
        Message instance = new Message("+27632610239", "Hi Mike, can you join us for dinner tonight?", "123456789", 3);
        int expResult = 3;
        int result = instance.getMessageNumber();
        assertEquals(expResult, result);
        
    }
}
    
  

   