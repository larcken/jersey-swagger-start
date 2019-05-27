package com.larcken.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
@Api(value = "", description = "Description")
public class Apis {
    @GET
    @ApiOperation(value = "Hello", notes = "notes")
    @ApiResponses(value = {
        @ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "Unauthorized"),
        @ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "Not Found")
    })
    public Response hellowWorld() {
        Response result = null;
        String str = "Hellow World!";
        result = Response.ok().entity(str).build();
        return result;
    }
    
    
}
