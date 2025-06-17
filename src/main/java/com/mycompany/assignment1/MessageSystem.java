/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MessageSystem {
     // Arrays to store the messages
    List<Message> sentMessages = new ArrayList<>();
    private List<Message> disregardedMessages = new ArrayList<>();
    private List<Message> storedMessages = new ArrayList<>();
    private List<String> messageHashes = new ArrayList<>();
    private List<Integer> messageIds = new ArrayList<>();

    // Method to populate the arrays with test data
    public void populateArrays() {
        List<Message> messages = Arrays.asList(
                new Message("+27834557896", "Did you get the cake?", "Sent", 1),
                new Message("+278388846567", "Where are you? You are late! I have asked you to be on time.", "Stored", 2),
                new Message("+2783448467", "Yohoooo, I am at your gate.", "Sent", 3),
                new Message("0838884567", "It is dinner time!", "Sent", 4),
                new Message("+27838884567", "Ok, I am leaving without you.", "Sent", 5)
        );

        for (Message msg : messages) {
            if (msg.getFlag().equals("Sent")) {
                sentMessages.add(msg);
            } else if (msg.getFlag().equals("Stored")) {
                storedMessages.add(msg);
            }
            messageHashes.add(msg.getMessageHash());
            messageIds.add(msg.getMessageId());
        }
    }

    // a. Display sender and recipient of all sent messages
    public void displaySentMessages() {
        for (Message msg : sentMessages) {
            System.out.println("Sender: " + msg.getRecipient() + ", Message: " + msg.getMessage());
        }
    }

    // b. Display the longest sent message
    public void displayLongestSentMessage() {
        Message longest = sentMessages.stream()
                .max(Comparator.comparingInt(msg -> msg.getMessage().length()))
                .orElse(null);
        if (longest != null) {
            System.out.println("Longest Sent Message: " + longest.getMessage());
        }
    }

    // c. Search for a message ID and display the corresponding recipient and message
    public void searchMessageById(int messageId) {
        Message msg = sentMessages.stream()
                .filter(m -> m.getMessageId() == messageId)
                .findFirst()
                .orElse(null);
        if (msg != null) {
            System.out.println("Message ID: " + messageId + " -> Recipient: " + msg.getRecipient() + ", Message: " + msg.getMessage());
        } else {
            System.out.println("Message ID not found");
        }
    }

    // d. Search all messages sent to a particular recipient
    public void searchMessagesByRecipient(String recipient) {
        List<Message> result = new ArrayList<>();
        for (Message msg : sentMessages) {
            if (msg.getRecipient().equals(recipient)) {
                result.add(msg);
            }
        }
        if (!result.isEmpty()) {
            for (Message msg : result) {
                System.out.println(msg.getMessage());
            }
        } else {
            System.out.println("No messages found for recipient: " + recipient);
        }
    }

    // e. Delete a message using a message hash
    public void deleteMessageByHash(String messageHash) {
        sentMessages.removeIf(msg -> msg.getMessageHash().equals(messageHash));
        storedMessages.removeIf(msg -> msg.getMessageHash().equals(messageHash));
        System.out.println("Message with hash " + messageHash + " successfully deleted.");
    }

    // f. Display a report showing all sent messages
    public void displayReport() {
        for (Message msg : sentMessages) {
            System.out.println(msg);
        }
    }
}

