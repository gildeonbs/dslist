package com.gildeonbs.dslist.dto;

import com.gildeonbs.dslist.entities.Game;

// Game mínimo DTO
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    // Construtor que recebe objeto Game entity
    public GameMinDTO(Game entity) {
        // Não preciso do "this." porque não há ambiguidade entre parametros e atributos da classe
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // Só preciso dos getters no DTO
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
