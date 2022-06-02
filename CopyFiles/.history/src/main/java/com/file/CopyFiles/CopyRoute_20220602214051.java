package com.file.CopyFiles;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class CopyRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
         from("file:files/input?delay=10000&maxMessagesPerPoll=1")
        // .routeId("Files-Input-Route")
        // .transform().body(String.class)
        // .choice()
        //   	.when(simple("${file:ext} == 'xml'")) 
        //   	    .log("XML File")
        //   	.otherwise()
        //   	 .log("Not a XML File")
        //   	 .end()
        //  // .to("direct://log-file-values")
        .to("file:files/output");
        
    }
    
}
