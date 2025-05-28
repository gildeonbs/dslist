package com.gildeonbs.dslist.services;

import com.gildeonbs.dslist.dto.GameDTO;
import com.gildeonbs.dslist.dto.GameMinDTO;
import com.gildeonbs.dslist.entities.Game;
import com.gildeonbs.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    // I inject the game repository from the layer below - I get an instance of the game repository inside the game service
    @Autowired
    private GameRepository gameRepository;

    // Spring's @Transactional annotation manages the transaction scope for the method
    // The "readOnly = true" flag optimizes performance for read operations by avoiding unnecessary locking and persistence context flushing
    // This is useful when the method only reads data and doesn't perform any updates or inserts
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        // TODO: Improve this by handling the case where the given ID does not exist
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    // Returns a list of GameMinDTO objects
    @Transactional(readOnly = true)
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
