package com.sakila.lewis.blockbuster.Actor;

import com.sakila.lewis.blockbuster.Film.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="actor")
public class Actor {

    // Identifier attribute.
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Attributes to define an actor.
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    // Linking attribute.
    @ManyToMany(mappedBy = "actors")
    Set<Film> films;

    // Default constructor.
    public Actor(){}
    // Parameter constructor.
    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
