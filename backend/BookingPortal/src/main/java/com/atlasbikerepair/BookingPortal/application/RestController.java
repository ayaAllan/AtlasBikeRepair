package com.atlasbikerepair.BookingPortal.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController {
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";

    }
}