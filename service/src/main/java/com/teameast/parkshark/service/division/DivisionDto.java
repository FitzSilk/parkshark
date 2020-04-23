package com.teameast.parkshark.service.division;

public class DivisionDto {

    private final Integer id;
    private final String name;
    private final String originalName;
    private final String director;

    public DivisionDto(DivisionDtoBuilder divisionDtoBuilder) {
        this.id = divisionDtoBuilder.getId();
        this.name = divisionDtoBuilder.getName();
        this.originalName = divisionDtoBuilder.getOriginalName();
        this.director = divisionDtoBuilder.getDirector();
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

    public String getDirector() {
        return director;
    }

    public static class DivisionDtoBuilder {
        private Integer id;
        private String name;
        private String originalName;
        private String director;

        protected DivisionDtoBuilder() {
        }

        public static DivisionDtoBuilder divisionDtoBuilder() {
            return new DivisionDtoBuilder();
        }

        public DivisionDto build() {
            return new DivisionDto(this);
        }

        public DivisionDtoBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public DivisionDtoBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DivisionDtoBuilder withOriginalName(String originalName) {
            this.originalName = originalName;
            return this;
        }

        public DivisionDtoBuilder withDirector(String director) {
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

        public String getDirector() {
            return director;
        }
    }
}
