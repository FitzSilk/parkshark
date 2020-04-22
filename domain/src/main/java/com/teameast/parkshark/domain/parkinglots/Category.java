package com.teameast.parkshark.domain.parkinglots;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name="category")
public class Category {
    @Id
    @Column (name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="category")
    private String category;

    public Category(){}

    public Category(int id, String category) {
        this.id=id;
        this.category=category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category1 = (Category) o;
        return Objects.equals(category, category1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }
}
