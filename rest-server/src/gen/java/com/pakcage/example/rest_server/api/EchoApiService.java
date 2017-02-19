package com.pakcage.example.rest_server.api;

import com.pakcage.example.rest_server.api.*;
import com.pakcage.example.rest_server.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.pakcage.example.rest_server.model.EchoResponse;
import com.pakcage.example.rest_server.model.Error;

import java.util.List;
import com.pakcage.example.rest_server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-18T20:59:10.202+04:00")
public abstract class EchoApiService {
    public abstract Response echo(String message,SecurityContext securityContext) throws NotFoundException;
}
