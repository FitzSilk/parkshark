package com.teameast.parkshark.domain.division;

import com.teameast.parkshark.domain.Person;

public class Division {

    private Integer id;
    private String name;
    private String originalName;
    private Person director;
    private double monthlyCost;
    private double reductionRate;

    public Division() {
    }

    public Division(DivisionBuilder divisionBuilder) {
        id = divisionBuilder.getId();
        name = divisionBuilder.getName();
        originalName = divisionBuilder.getOriginalName();
        director = divisionBuilder.getDirector();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Person getDirector() {
        return director;
    }

    public static class DivisionBuilder {
        private Integer id;
        private String name;
        private String originalName;
        private Person director;
        private double monthlyCost;
        private double reductionRate;

        protected DivisionBuilder() {
        }

        public static DivisionBuilder divisionBuilder() {
            return new DivisionBuilder();
        }

        public Division build() {
            return new Division(this);
        }

        public DivisionBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public DivisionBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DivisionBuilder withOriginalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        public DivisionBuilder withDirector(Person director) {
            this.director = director;
            return this;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getOriginalName() {
            return originalName;
        }

        public Person getDirector() {
            return director;
        }
    }

}
