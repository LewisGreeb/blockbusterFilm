package com.sakila.lewis.blockbuster;

import javax.persistence.*;

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
    private int language_id;
    private int rental_duration;
    private double rental_rate;
    private int length;
    private double replacement_cost;
    // private Rating rating;
    private String rating;
    private String special_features;
    private String last_update;

    // Default empty constructor.
    public Film(){}
    // Constructor with attributes.
    public Film(String title, String description, int release_year, int language_id, int rental_duration, double rental_rate,
                int length, double replacement_cost, String rating, String special_features, String last_update){
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
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
        this.last_update = last_update;
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

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
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

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
