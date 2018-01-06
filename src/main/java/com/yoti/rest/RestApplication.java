package com.yoti.rest;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig {

    public RestApplication() {

        //服务类所在的包路径
        packages("com.yoti.rest.resource");
        //注册JSON转换器
        register(JacksonJsonProvider.class);
        //接收Json时转换成Pojo
        register(JacksonFeature.class);

    }

}
