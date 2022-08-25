package com.sakila.lewis.blockbuster.language;

import com.sakila.lewis.blockbuster.film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="language")
public class Language {

    // Identifier attribute.
    @Id
    @Column(name="language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Attributes of language table.
    @Column(name="name")
    private String name;

    // Linking attribute.
    @OneToMany
    @JoinColumn(name = "language_id")
    private Set<Film> films;

    // Default empty constructor.
    public Language(){}
    // Constructor with attributes.
    public Language(String name){
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
