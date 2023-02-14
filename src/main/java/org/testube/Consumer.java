package org.testube;

import org.testube.Messages.EmailMessenger;
import org.testube.Messages.SMSMessenger;

public class Consumer {
    public void processSteps(){
        EmailMessenger emailMessenger = new EmailMessenger();
        SMSMessenger smsMessenger = new SMSMessenger();

        // Do some processing to generate messages
        String message = "some shit other than hello world";

        emailMessenger.sendMessage(message);
        smsMessenger.sendMessage(message);

        System.out.println("Finished Consumer!");
    }
}
