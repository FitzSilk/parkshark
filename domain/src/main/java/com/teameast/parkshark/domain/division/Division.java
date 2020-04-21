package com.teameast.parkshark.domain.division;

import com.teameast.parkshark.domain.personalinformation.Person;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Table
@Entity
public class Division {

    @Id
    private Integer division_id;

    @Column(name = "division_name")
    private String name;

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "director_name")
    private String director;

    public Division() {
    }

    public Division(DivisionBuilder divisionBuilder) {
        division_id = divisionBuilder.getId();
        name = divisionBuilder.getName();
        originalName = divisionBuilder.getOriginalName();
        director = divisionBuilder.getDirector();
    }

    public void setId(Integer id) {
        this.division_id = id;
    }

    public Integer getId() {
        return division_id;
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

    public static class DivisionBuilder {
        private Integer id;
        private String name;
        private String originalName;
        private String director;

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

        public DivisionBuilder withDirector(String director) {
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
