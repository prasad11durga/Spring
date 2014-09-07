package com.seethayya.webservice.soapservice.impl;

import com.seethayya.webservice.soapservice.HelloWorld;
import org.apache.log4j.Logger;

import javax.jws.WebService;

/**
 * Created by Admin on 07-Sep-14.
 */
@WebService(endpointInterface = "com.seethayya.webservice.soapservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorldImpl.class);

    @Override
    public String sayHello(String message) {
        LOGGER.debug("--Message:"+message);
        return "Hello "+message;
    }
}
