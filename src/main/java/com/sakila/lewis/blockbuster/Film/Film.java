package com.sakila.lewis.blockbuster.Film;

import com.sakila.lewis.blockbuster.Actor.Actor;
import com.sakila.lewis.blockbuster.Category.Category;
import com.sakila.lewis.blockbuster.Language.Language;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @Column(name="release_year")
    private Integer releaseYear;
    @Column(name="language_id")
    private Integer languageID;
    @Column(name="rental_duration")
    private Integer rentalDuration;
    @Column(name="rental_rate")
    private BigDecimal rentalRate;
    private Integer length;
    @Column(name="replacement_cost")
    private BigDecimal replacementCost;
    // private Rating rating;
    private String rating;
    @Column(name="special_features")
    private String specialFeatures;

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
    public Film(FilmDTO filmDTO){
        this.dtoConversion(filmDTO);
    }

    // DTO conversion method.
    public void dtoConversion(FilmDTO filmDTO){
        this.title = filmDTO.getTitle().orElse(title);
        this.description = filmDTO.getDescription().orElse(description);
        this.releaseYear = filmDTO.getReleaseYear().orElse(releaseYear);
        this.languageID = filmDTO.getLanguageID().orElse(languageID);
        this.rentalDuration = filmDTO.getRentalDuration().orElse(rentalDuration);
        this.rentalRate = filmDTO.getRentalRate().orElse(rentalRate);
        this.length = filmDTO.getLength().orElse(length);
        this.replacementCost = filmDTO.getReplacementCost().orElse(replacementCost);
        this.rating = filmDTO.getRating().orElse(rating);
        this.specialFeatures = filmDTO.getSpecialFeatures().orElse(specialFeatures);
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int release_year) {
        this.releaseYear = release_year;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String special_features) {
        this.specialFeatures = special_features;
    }
}