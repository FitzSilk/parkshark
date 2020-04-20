package com.teameast.parkshark.api;

import com.teameast.parkshark.service.division.DivisionDto;
import com.teameast.parkshark.service.division.DivisionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = DivisionController.DIVISION_RESOURCE_PATH)
public class DivisionController {

    public static final String DIVISION_RESOURCE_PATH = "/divisions";
    private final Logger myLogger = LoggerFactory.getLogger(DivisionController.class);
    private final DivisionService divisionService;

    @Autowired
    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping(produces = "application/json")
    public String sayHello() {
        myLogger.info("someone visited this page");
        return "hello";
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public DivisionDto createDivision(DivisionDto divisionDto) {
        return divisionService.create(divisionDto);
    }
}
