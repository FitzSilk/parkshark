package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.division.Division;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.teameast.parkshark.domain.division.Division.DivisionBuilder.divisionBuilder;

@Component
public class DivisionMapper {

    public DivisionDto toDto(Division division) {
        return new DivisionDto(division.getId(), division.getName(), division.getOriginalName(), division.getDirector());
    }

    public List<DivisionDto> toDto(Collection<Division> divisions) {
        return divisions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Division toDivision(DivisionDto divisionDto) {
        return new Division(divisionBuilder()
                .withId(divisionDto.getId())
                .withName(divisionDto.getName())
                .withOriginalName(divisionDto.getOriginalName())
                .withDirector(divisionDto.getDirector())
        );
    }
}
