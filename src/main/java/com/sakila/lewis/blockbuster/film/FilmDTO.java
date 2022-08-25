package com.sakila.lewis.blockbuster.film;

import java.math.BigDecimal;
import java.util.Optional;

public class FilmDTO {

    private Integer id;
    private String title;
    private String description;
    private Integer releaseYear;
    private Integer languageID;
    private Integer rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Optional<Integer> getReleaseYear() {
        return Optional.ofNullable(releaseYear);
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Optional<Integer> getLanguageID() {
        return Optional.ofNullable(languageID);
    }

    public void setLanguageID(Integer languageID) {
        this.languageID = languageID;
    }

    public Optional<Integer> getRentalDuration() {
        return Optional.ofNullable(rentalDuration);
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Optional<BigDecimal> getRentalRate() {
        return Optional.ofNullable(rentalRate);
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Optional<Integer> getLength() {
        return Optional.ofNullable(length);
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Optional<BigDecimal> getReplacementCost() {
        return Optional.ofNullable(replacementCost);
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public Optional<String> getRating() {
        return Optional.ofNullable(rating);
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Optional<String> getSpecialFeatures() {
        return Optional.ofNullable(specialFeatures);
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
