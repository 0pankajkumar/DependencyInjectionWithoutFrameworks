package org.testube;

import org.testube.Consumers.Consumer;
import org.testube.Injectors.EmailMessengerInjector;
import org.testube.Injectors.FacebookMessengerInjector;
import org.testube.Injectors.Injector;
import org.testube.Injectors.SMSMessengerInjector;

public class Main {
    public static void main(String[] args) {

        String emailMessage = "some dependency injection working & sent as email";
        String smsMessage = "some dependency injection working & sent as sms";
        String facebookMessage = "some dependency injection working & sent as FB message";

        Injector injectorHolder = null;
        Consumer consumer = null;

        injectorHolder = new EmailMessengerInjector();
        consumer = injectorHolder.getConsumer();
        consumer.processSteps(emailMessage);

        injectorHolder = new SMSMessengerInjector();
        consumer = injectorHolder.getConsumer();
        consumer.processSteps(smsMessage);

        injectorHolder = new FacebookMessengerInjector();
        consumer = injectorHolder.getConsumer();
        consumer.processSteps(facebookMessage);



        System.out.println("Finished main process!");
    }
}