package com.gildeonbs.dslist.dto;

import com.gildeonbs.dslist.entities.Game;
import com.gildeonbs.dslist.projections.GameMinProjection;

// Minimum Game DTO
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    // Constructor that receives a Game entity object
    public GameMinDTO(Game entity) {
        // I don't need "this." because there is no ambiguity between parameters and class attributes
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // Constructor that receives a GameMinProjection object
    public GameMinDTO(GameMinProjection projection) {
        // I don't need "this." because there is no ambiguity between parameters and class attributes
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }
    // I only need the getters in the DTO
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
