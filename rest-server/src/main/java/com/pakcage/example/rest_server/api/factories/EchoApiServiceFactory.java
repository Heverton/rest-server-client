package com.pakcage.example.rest_server.api.factories;

import com.pakcage.example.rest_server.api.EchoApiService;
import com.pakcage.example.rest_server.api.impl.EchoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-18T20:59:10.202+04:00")
public class EchoApiServiceFactory {
    private final static EchoApiService service = new EchoApiServiceImpl();

    public static EchoApiService getEchoApi() {
        return service;
    }
}
