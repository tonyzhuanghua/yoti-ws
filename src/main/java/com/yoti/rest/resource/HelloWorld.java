package com.yoti.rest.resource;

import com.yoti.entity.RequestPojo;
import com.yoti.entity.ResponsePojo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/yoti")
public class HelloWorld {
    //GET注解设置接受请求类型为GET
    @GET
    //Produces表明发送出去的数据类型为text/plain
    // 与Produces对应的是@Consumes，表示接受的数据类型为text/plain
    @Produces("text/plain")
    public String getMessage() {
        return "Hellooooyyy world!";
    }

    @POST
    @Path("/test")
    //实际在浏览器的路径是~/yoti/test
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponsePojo getUserJson(RequestPojo requestPojo) {

        System.out.print(requestPojo.getInstructions());
     ResponsePojo responsePojo = new ResponsePojo();
     return  responsePojo;
    }
}
