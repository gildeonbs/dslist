package com.gildeonbs.dslist.services;

import com.gildeonbs.dslist.dto.GameMinDTO;
import com.gildeonbs.dslist.entities.Game;
import com.gildeonbs.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    // I inject the game repository from the layer below - I get an instance of the game repository inside the game service
    @Autowired
    private GameRepository gameRepository;

    // Returns a list of GameMinDTO objects
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // Stream is a Java library that allows operations on sequences of data.
        // The map transforms objects from one type to another
        // Every object x that was a Game is transformed "->" into a new GameMinDTO x
        // .toList() converts it back to a normal list
        List<GameMinDTO> gameMinDTOS = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTOS;
    }
}
