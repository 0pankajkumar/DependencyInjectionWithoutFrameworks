package org.testube.Messages;

public class EmailMessenger implements Messenger {
    public void sendMessage(String message){
        // Doing something to send email
        System.out.printf("Sent Email with test message : %s \n", message);
    }
}
