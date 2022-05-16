package com.camel.micro.camelmicroservicesa.router.a;

import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouter extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("timer:first-timer")
       // .transform().constant("Time now "+LocalDateTime.now() )
       .bean("getCurrentTimeBean")
        .to("log:first-timer");
    }

    
}

class GetCurrentTimeBean{

    public String getCurrentTime(){
        return "Time now is: "+LocalDateTime.now();
    }
}