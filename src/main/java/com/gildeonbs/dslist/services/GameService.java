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

    // Injeto o game repository da camada abaixo - Puxo uma instancia do game repository dentro do game service
    @Autowired
    private GameRepository gameRepository;

    // Retorna uma lista de objeto Game DTO
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // Stream é uma lib do java permite fazer operações com sequência de dados.
        // o map, transforma obj de uma coisa para outra
        // Todos obj x que era game é transformado "->" em um novo GameMinDto x
        // .toList() transforma de volta para lista normal
        List<GameMinDTO> gameMinDTOS = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameMinDTOS;
    }
}
