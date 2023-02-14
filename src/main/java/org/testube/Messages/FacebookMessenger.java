package org.testube.Messages;

public class FacebookMessenger implements Messenger{
    @Override
    public void sendMessage(String message) {
        // Doing something to send FB message
        System.out.printf("Sent Facebook message with test message : %s \n", message);
    }
}
