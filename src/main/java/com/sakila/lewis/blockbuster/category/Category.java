package com.sakila.lewis.blockbuster.category;

import com.sakila.lewis.blockbuster.film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="category")
public class Category {

    // Identifier attribute.
    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Category name attribute.
    @Column(name="name")
    private String name;

    // Linking attribute.
    @ManyToMany(mappedBy = "categories")
    Set<Film> films;

    // Default constructor.
    public Category(){}
    // Parameter constructor.
    public Category(String name){
        this.name = name;
    }

    // Getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
