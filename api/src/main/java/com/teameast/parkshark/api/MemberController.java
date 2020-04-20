package com.teameast.parkshark.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/members")
public class MemberController {
    private final Logger myLogger = LoggerFactory.getLogger(MemberController.class);


    @GetMapping(produces = "application/json")
    public String sayHello() {
        myLogger.info("someone visited this page");
        return "hello";
    }


}
