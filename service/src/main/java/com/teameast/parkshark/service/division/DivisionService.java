package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.division.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    private DivisionRepository divisionRepository;
    private DivisionMapper divisionMapper;

    @Autowired
    public DivisionService(DivisionRepository divisionRepository, DivisionMapper divisionMapper) {
        this.divisionRepository = divisionRepository;
        this.divisionMapper = divisionMapper;
    }

    public DivisionDto create(DivisionDto divisionDto) {
        return divisionMapper.toDto(divisionRepository.save(divisionMapper.toDivision(divisionDto)));
    }

    public List<DivisionDto> getAllDivisions() {
        return divisionMapper.toDto(divisionRepository.getAllDivisions());
    }
}
