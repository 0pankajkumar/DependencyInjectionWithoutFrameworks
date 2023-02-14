package org.testube.Messages;

public class SMSMessenger implements Messenger {
    public void sendMessage(String message){
        // Doing something to send sms
        System.out.printf("Sent SMS with test message : %s \n", message);
    }
}
