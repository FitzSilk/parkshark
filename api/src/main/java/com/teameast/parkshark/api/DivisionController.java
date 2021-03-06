package com.teameast.parkshark.api;

import com.teameast.parkshark.service.division.DivisionDto;
import com.teameast.parkshark.service.division.DivisionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<DivisionDto> getAllDivisions() {
        myLogger.info("someone is trying to get all infos on divisions");
        return divisionService.getAllDivisions();
    }

    @GetMapping(path = "/id", produces = "application/json")
    public DivisionDto getDivisionById(@RequestParam int id) {
        myLogger.info("someone try to get informations on one division, here.");
        return divisionService.getDivisionById(id);
    }

    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public DivisionDto createDivision(@RequestParam String name,
                                      @RequestParam(name = "original_name") String originalName,
                                      @RequestParam(name = "director_name") String directorName) {
        myLogger.info("someone try to create a division here!");
        return divisionService.create(name, originalName, directorName);
    }
}
