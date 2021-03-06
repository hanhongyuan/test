package com.service.mytest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-27T09:50:20.633Z")

@RestSchema(schemaId = "mytest")
@RequestMapping(path = "/mytest", produces = MediaType.APPLICATION_JSON)
public class MytestImpl {

    @Autowired
    private MytestDelegate userMytestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMytestDelegate.helloworld(name);
    }

}
