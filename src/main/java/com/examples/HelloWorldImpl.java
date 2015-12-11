package com.examples;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.examples.HelloWorld")
public class HelloWorldImpl implements HelloWorld{


    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}
