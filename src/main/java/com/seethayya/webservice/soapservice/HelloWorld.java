package com.seethayya.webservice.soapservice;

import javax.jws.WebService;

/**
 * Created by Admin on 07-Sep-14.
 */
@WebService
public interface HelloWorld {

    String sayHello(String message);
}
