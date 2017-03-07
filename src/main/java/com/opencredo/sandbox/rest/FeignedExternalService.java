package com.opencredo.sandbox.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "http://another.external.endpoint.com", fallback = FeignedExternalServiceFallback.class)
interface FeignedExternalService {
    @RequestMapping(value = "/myOtherEndpoint", method = GET)
    String doTheOtherThing();
}

class FeignedExternalServiceFallback implements FeignedExternalService {
    @Override
    public String doTheOtherThing() {
        return null;
    }
}
