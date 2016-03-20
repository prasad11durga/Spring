package com.seethayya.webservices;

import com.seethayya.webservice.soapservice.HelloWorld;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Admin on 07-Sep-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath*:applicationContext-test.xml")
public class WebServiceClient {

    private HelloWorld helloWorld;
    private static final Logger LOGGER = Logger.getLogger(WebServiceClient.class);

    @Test
    public void testHelloWorld() {
        LOGGER.debug("=====Start---");
        System.out.println("====start");
        String message = helloWorld.sayHello("Good morning");
        LOGGER.debug("=====END---"+message);
    }

    @Resource(name = "helloClient")
    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
