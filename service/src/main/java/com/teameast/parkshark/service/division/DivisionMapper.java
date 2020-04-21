package com.teameast.parkshark.service.division;

import com.teameast.parkshark.domain.division.Division;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.teameast.parkshark.domain.division.Division.DivisionBuilder.divisionBuilder;
import static com.teameast.parkshark.service.division.DivisionDto.DivisionDtoBuilder.divisionDtoBuilder;

@Component
public class DivisionMapper {

    public DivisionDto toDto(Division division) {
        return new DivisionDto(divisionDtoBuilder()
                .withName(division.getName())
                .withOriginalName(division.getOriginalName())
                .withDirector(division.getDirector())
        );
    }

    public List<DivisionDto> toDto(Collection<Division> divisions) {
        return divisions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Division toDivision(String name, String originalName, String directorName) {
        return new Division(divisionBuilder()
                .withName(name)
                .withOriginalName(originalName)
                .withDirector(directorName)
        );
    }
}
