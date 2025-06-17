/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MessageSystemTest {
    
    private MessageSystem messageSystem;

    @BeforeEach
    void setUp() {
        messageSystem = new MessageSystem();
        messageSystem.populateArrays();
    }

    @Test
    void testSentMessagesArrayPopulation() {
        assertEquals(4, messageSystem.sentMessages.size());  // Sent messages count
        assertEquals("Did you get the cake?", messageSystem.sentMessages.get(0).getMessage());
        assertEquals("Yohoooo, I am at your gate.", messageSystem.sentMessages.get(2).getMessage());
    }

    @Test
    void testLongestSentMessage() {
        messageSystem.displayLongestSentMessage();  // Expected output: "Where are you? You are late! I have asked you to be on time."
    }

    @Test
    void testSearchByMessageId() {
        messageSystem.searchMessageById(4);  // Expected output: "Message ID: 4 -> Recipient: 0838884567, Message: It is dinner time!"
        messageSystem.searchMessageById(10); // Expected output: "Message ID not found"
    }

    @Test
    void testSearchByRecipient() {
        messageSystem.searchMessagesByRecipient("+27838884567");  // Expected output: Two messages sent to this recipient
    }

    @Test
    void testDeleteMessageByHash() {
        String hashToDelete = messageSystem.sentMessages.get(1).getMessageHash();
        messageSystem.deleteMessageByHash(hashToDelete);  // Expected output: "Message successfully deleted"
        assertEquals(3, messageSystem.sentMessages.size());  // One message should be deleted
    }

    @Test
    void testDisplayReport() {
        messageSystem.displayReport();  // Check the printed output manually
    }
}