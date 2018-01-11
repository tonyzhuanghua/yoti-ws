package com.yoti.rest.resource;

import com.yoti.biz.ActionBiz;
import com.yoti.entity.RequestPojo;
import com.yoti.entity.ResponsePojo;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/yoti")
public class RestService {
    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "test test test!";
    }

    @POST
    @Path("/test")
    //路径是~/yoti/test
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponsePojo getResponseJson(RequestPojo requestPojo) throws Exception {
        ResponsePojo responsePojo = new ResponsePojo();

        return new ActionBiz().processClean(requestPojo);

    }
}
