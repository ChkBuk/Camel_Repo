package com.camel.micro.camelmicroservicesa.router.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouter extends RouteBuilder{

    @Autowired
    private GetCurrentTimeBean getCurrentTimeBean;
    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
        .log("My message")
       // .transform().constant("Time now "+LocalDateTime.now() )
       .bean(getCurrentTimeBean)
        .to("log:first-timer");
    }

    
}

@Component
class GetCurrentTimeBean{

    public String getCurrentTime(){
        return "Time now is: "+LocalDateTime.now();
    }
}