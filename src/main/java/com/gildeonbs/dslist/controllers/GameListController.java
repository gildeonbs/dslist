package com.gildeonbs.dslist.controllers;

import com.gildeonbs.dslist.dto.GameListDTO;
import com.gildeonbs.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Back-End Entry Point
// API
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    /*
    *@GetMapping(value = "/{id}")
    *public GameDTO findById(@PathVariable Long id){
    *   return gameService.findById(id);
    *}
    */

}
