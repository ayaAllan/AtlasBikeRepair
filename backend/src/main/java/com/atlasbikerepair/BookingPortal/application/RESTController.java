package com.atlasbikerepair.BookingPortal.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";

    }
}