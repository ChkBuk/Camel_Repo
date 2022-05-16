package com.camel.micro.camelmicroservicesa.router.c;

import org.apache.camel.builder.RouteBuilder;

public class ActiveMQSenderRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("timer:active-mq-timer?period=1000")
        .transform().constant("My message for Active MQ")
        .to("activemq:my-activemq-queue");
        
    }
    
}
