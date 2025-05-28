package com.gildeonbs.dslist.services;

import com.gildeonbs.dslist.dto.GameListDTO;
import com.gildeonbs.dslist.entities.GameList;
import com.gildeonbs.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    // I inject the game repository from the layer below - I get an instance of the game repository inside the game service
    @Autowired
    private GameListRepository gameListRepository;

    // Spring's @Transactional annotation manages the transaction scope for the method
    // The "readOnly = true" flag optimizes performance for read operations by avoiding unnecessary locking and persistence context flushing
    // This is useful when the method only reads data and doesn't perform any updates or inserts
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        // Stream is a Java library that allows operations on sequences of data.
        // The map transforms objects from one type to another
        // Every object x that was a Game is transformed "->" into a new GameMinDTO x
        // .toList() converts it back to a normal list
        List<GameListDTO> gameListDTOS = result.stream().map(x -> new GameListDTO(x)).toList();
        return gameListDTOS;
    }


}
