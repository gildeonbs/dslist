package com.gildeonbs.dslist.controllers;

import java.util.List;

import com.gildeonbs.dslist.dto.GameDTO;
import com.gildeonbs.dslist.dto.GameMinDTO;
import com.gildeonbs.dslist.entities.Game;
import com.gildeonbs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Back-End Entry Point
// API
@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }


}
