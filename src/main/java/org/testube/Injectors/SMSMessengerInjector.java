package org.testube.Injectors;

import org.testube.Consumers.Consumer;
import org.testube.Consumers.ConsumerAlpha;
import org.testube.Messages.SMSMessenger;

public class SMSMessengerInjector implements Injector {
    public Consumer getConsumer(){
        return new ConsumerAlpha(new SMSMessenger());
    }
}
