package com.teameast.parkshark.api;

import com.teameast.parkshark.service.member.MemberService;
import com.teameast.parkshark.service.member.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;

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
    public Collection<UserDto> getAllMembers() {
        myLogger.info("someone is trying to get all members");
        return memberService.getAllMembers();
    }

    @GetMapping(path = "/id", produces = "application/json")
    public UserDto getMemberById(@RequestParam UUID id) {
        myLogger.info("someone try to get informations on a user");
        return memberService.getMemberById(id);
    }

    @PostMapping(produces = "application/json")
    @ResponseStatus(value = HttpStatus.CREATED)
    public UserDto saveMember(@RequestParam String firstName,
                              @RequestParam String lastName,
                              @RequestParam String licencePlate,
                              @RequestParam String licencePlateCountry,
                              @RequestParam String email,
                              @RequestParam String streetName,
                              @RequestParam String streetNumber,
                              @RequestParam String zipCode,
                              @RequestParam String phoneNumber) {
        myLogger.info("someone is trying to register here!");
        return memberService.saveMember(firstName, lastName, licencePlate, licencePlateCountry, email, streetName, streetNumber, zipCode, phoneNumber);
    }

}
