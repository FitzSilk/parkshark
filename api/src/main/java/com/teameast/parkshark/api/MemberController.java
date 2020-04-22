package com.teameast.parkshark.api;

import com.teameast.parkshark.service.member.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = MemberController.MEMBER_RESOURCE_PATH)
public class MemberController {
    public static final String MEMBER_RESOURCE_PATH = "/members";
    private final Logger myLogger = LoggerFactory.getLogger(MemberController.class);
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(produces = "application/json")
    public String sayHello() {
        myLogger.info("someone visited this page");
        //return memberService.getAllMembers();
        return "hello";
    }


}
