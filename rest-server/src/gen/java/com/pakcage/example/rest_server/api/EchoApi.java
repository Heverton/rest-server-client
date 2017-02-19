package com.pakcage.example.rest_server.api;

import com.pakcage.example.rest_server.model.*;
import com.pakcage.example.rest_server.api.EchoApiService;
import com.pakcage.example.rest_server.api.factories.EchoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.pakcage.example.rest_server.model.EchoResponse;
import com.pakcage.example.rest_server.model.Error;

import java.util.List;
import com.pakcage.example.rest_server.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/echo")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the echo API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-18T20:59:10.202+04:00")
public class EchoApi  {
   private final EchoApiService delegate = EchoApiServiceFactory.getEchoApi();

    @GET
    @Path("/{message}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns the 'message' to the caller", response = EchoResponse.class, tags={ "Echo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = EchoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error", response = EchoResponse.class) })
    public Response echo(@ApiParam(value = "message",required=true) @PathParam("message") String message
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.echo(message,securityContext);
    }
}
