package com.opencredo.sandbox.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "http://external.service.org", fallback = FeignedExternalServiceFallback.class)
interface FeignedExternalService {
    @RequestMapping(value = "/myendpoint", method = GET)
    String doTheThing();
}

class FeignedExternalServiceFallback implements FeignedExternalService {
    @Override
    public String doTheThing() {
        return null;
    }
}
