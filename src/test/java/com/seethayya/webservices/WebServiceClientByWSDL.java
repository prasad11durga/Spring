package com.seethayya.webservices;

import com.seethayya.webservice.soapservice.impl.HelloWorld;
import com.seethayya.webservice.soapservice.impl.HelloWorldImplService;
import org.junit.Test;

import javax.xml.ws.WebServiceRef;

/**
 * Created by Admin on 10-Sep-14.
 */
public class WebServiceClientByWSDL {

    @WebServiceRef(wsdlLocation = "http://localhost:8180/webServices/services/HelloWorld?wsdl")
    private HelloWorldImplService helloWorldImplService;

    @Test
    public void testHelloWorldServe() {
        helloWorldImplService = new HelloWorldImplService();
        HelloWorld helloWorld = helloWorldImplService.getHelloWorldImplPort();
        String message = helloWorld.sayHello("Seethayya78123");
        System.out.println(message);
    }
}
