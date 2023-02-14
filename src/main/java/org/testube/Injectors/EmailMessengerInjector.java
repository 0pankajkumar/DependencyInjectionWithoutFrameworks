package org.testube.Injectors;

import org.testube.Consumers.Consumer;
import org.testube.Consumers.ConsumerAlpha;
import org.testube.Messages.EmailMessenger;

public class EmailMessengerInjector implements Injector {
    public Consumer getConsumer(){
        return new ConsumerAlpha(new EmailMessenger());
    }
}
