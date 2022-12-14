package com.redhat.training.processingorders;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

// TODO: Enable the route by extending the RouteBuilder superclass
@Component
public class FtpToFileRouteBuilder extends RouteBuilder{

    @Override
    public void configure() throws Exception {
     
        from(
            "ftp://localhost:21721/?" +
            "username=datauser&password=fuse&" + 
            "include=ticket.*txt&" +
            "passiveMode=true")
            .routeId("ftpRoute")
            .process((exchange)->{System.out.println("processed");})
            .log("File: ${header.CamelFileName}")
            .to("file:customer_requests/");
        
    }

}
