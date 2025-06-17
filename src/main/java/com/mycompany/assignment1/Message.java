/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.Objects;
import org.json.JSONObject;

/**
 *
 * @author RC_Student_lab
 */
public class Message {

    static int getTotalMessagesSent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      private String recipient;
    private String message;
    private String flag;
    private String messageHash;
    private int messageId;

    // Constructor
    public Message(String recipient, String message, String flag, int messageId) {
        this.recipient = recipient;
        this.message = message;
        this.flag = flag;
        this.messageId = messageId;
        this.messageHash = generateMessageHash(message);
    }

    // Getter methods
    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public String getFlag() {
        return flag;
    }

    public String getMessageHash() {
        return messageHash;
    }

    public int getMessageId() {
        return messageId;
    }

    // Method to generate the hash for the message
    private String generateMessageHash(String message) {
        return Integer.toHexString(message.hashCode());  // Simple hash generation
    }

    @Override
    public String toString() {
        return "MessageID: " + messageId + ", Recipient: " + recipient + ", Message: " + message + ", Hash: " + messageHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return messageId == message1.messageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId);
    }

    String getMessageContent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isValidMessageID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean isValidRecipient(String number) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getMessageOption(int option) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    JSONObject toJSON() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String printMessageDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

