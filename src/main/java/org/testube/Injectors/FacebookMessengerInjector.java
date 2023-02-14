package org.testube.Injectors;

import org.testube.Consumers.Consumer;
import org.testube.Consumers.ConsumerAlpha;
import org.testube.Messages.FacebookMessenger;

public class FacebookMessengerInjector implements Injector{
    @Override
    public Consumer getConsumer() {
        return new ConsumerAlpha(new FacebookMessenger());
    }
}
