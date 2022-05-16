package com.camel.micro.camelmicroservicesa.router.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouter extends RouteBuilder{

    @Autowired
    private GetCurrentTimeBean getCurrentTimeBean;

    @Autowired
    private SimpleLoggingComponenet simpleLoggingComponenet;

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
        .log("${body}")
       .transform().constant("Transformation======= :: ")
       .log("${body}")
       .bean(getCurrentTimeBean)
       .bean(simpleLoggingComponenet)
       .log("${body}")
        .to("log:first-timer");
    }

    
}

@Component
class GetCurrentTimeBean{

    public String getCurrentTime(){
        return "Time now is: "+LocalDateTime.now();
    }
}


@Component
class SimpleLoggingComponenet{

    public void process(String msg){
         Logger logger = LoggerFactory.getLogger(SimpleLoggingComponenet.class);
        logger.info( "Logging Time now is: "+LocalDateTime.now());
    }
}