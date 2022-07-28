package com.sakila.lewis.blockbuster.Film;

import com.sakila.lewis.blockbuster.Actor.Actor;
import com.sakila.lewis.blockbuster.Category.Category;
import com.sakila.lewis.blockbuster.Language.Language;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="film")
public class Film {

    // Identifier attribute.
    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Attributes of film table.
    private String title;
    private String description;
    private int release_year;
    @Column(name="language_id")
    private int languageID;
    private int rental_duration;
    private double rental_rate;
    private int length;
    private double replacement_cost;
    // private Rating rating;
    private String rating;
    private String special_features;

    // Linking attribute - actor.
    @ManyToMany
            @JoinTable(
                    name = "film_actor",
                    joinColumns = @JoinColumn(name = "film_id"),
                    inverseJoinColumns = @JoinColumn(name = "actor_id")
            )
    Set<Actor> actors;

    // Linking attribute - language.
    @ManyToOne
    @JoinColumn(name = "language_id", insertable = false, updatable = false)
    private Language language;

    // Linking attribute - category.
    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    Set<Category> categories;

    // Default empty constructor.
    public Film(){}
    // Constructor with attributes.
    public Film(String title, String description, int release_year, int languageID, int rental_duration, double rental_rate,
                int length, double replacement_cost, String rating, String special_features){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.languageID = languageID;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        /*this.rating = switch (rating) {
            case "PG" -> Rating.PG;
            case "PG-13" -> Rating.PG13;
            case "R" -> Rating.R;
            case "NC-17" -> Rating.NC17;
            default -> Rating.G;
        };*/
        this.special_features = special_features;
    }

    // Getters and setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
/*
    public String getRating() {
        return switch (rating) {
            case PG -> "PG";
            case PG13 -> "PG-13";
            case R -> "R";
            case NC17 -> "NC-17";
            default -> "G";
        };
    }

    public void setRating(String rating) {
        this.rating = switch (rating) {
            case "PG" -> Rating.PG;
            case "PG-13" -> Rating.PG13;
            case "R" -> Rating.R;
            case "NC-17" -> Rating.NC17;
            default -> Rating.G;
        };
    }*/

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

}
