package com.hr.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIVersionDemoController {

    @RequestMapping(path = "/v1")
    public String urlVersion1()
    {
        return "Request param - v1";
    }

    @RequestMapping(path = "/v2")
    public String urlVersion2()
    {
        return "Request param - v2";
    }

    @RequestMapping(path = "/rp", params = "version=1")
    public String requestParamV1()
    {
        return "Request param - v1";
    }

    @RequestMapping(value = "/rp", params = "version=2")
    public String requestParamV2()
    {
        return "Request param - v2";
    }

    @RequestMapping(path = "/head", headers = "X_API=1")
    public String header1()
    {
        return "Header param - v1";
    }

    @RequestMapping(value = "/head", headers = "X_API=2")
    public String header2()
    {
        return "Header param - v2";
    }

}
