package com.info.controller;

import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class SampleController
{
    @RequestMapping(value = "/test/data", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void get()
    {
        System.out.println("hello");
    }
}
