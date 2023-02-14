package org.testube.Consumers;


import org.testube.Messages.Messenger;

public class ConsumerAlpha implements Consumer {

    private final Messenger messengerService;

    public ConsumerAlpha(Messenger service){
        this.messengerService = service;
    }
    public void processSteps(String message){

        messengerService.sendMessage(message);

        System.out.println("Finished Consumer!");
    }
}
