package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.division.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    private final DivisionRepository divisionRepository;
    private final DivisionMapper divisionMapper;

    @Autowired
    public DivisionService(DivisionRepository divisionRepository, DivisionMapper divisionMapper) {
        this.divisionRepository = divisionRepository;
        this.divisionMapper = divisionMapper;
    }

    public DivisionDto create(String name, String originalName, String director) {
        return divisionMapper.toDto(divisionRepository.save(divisionMapper.toDivision(name, originalName, director)));
    }

    public List<DivisionDto> getAllDivisions() {
        return divisionMapper.toDto(divisionRepository.findAll());
    }

    public DivisionDto getDivisionById(int id) {
        return divisionMapper.toDto(divisionRepository.findById(id).orElseThrow());
    }
}
