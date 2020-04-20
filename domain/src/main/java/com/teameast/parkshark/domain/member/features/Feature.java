package com.teameast.parkshark.domain.member.features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

public enum Feature {
    VIEW_DIVISIONS(RoleType.SUPER_USER),
    CREATE_DIVISION(RoleType.SUPER_USER);

    private RoleType[] roles;

    Feature(RoleType... roles) {
        this.roles = roles;
    }

    public List<RoleType> getRoles() {
        return newArrayList(roles);
    }

    public static List<Feature> getFeaturesForRoles(List<String> rolesOfUserAsString) {
        List<RoleType> rolesOfUser = rolesOfUserAsString.stream()
                .map(RoleType::valueOf)
                .collect(Collectors.toList());
        return Arrays.stream(Feature.values())
                .filter(feature -> !Collections.disjoint(feature.getRoles(), rolesOfUser))
                .collect(Collectors.toList());
    }
}
