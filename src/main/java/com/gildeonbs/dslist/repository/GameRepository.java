package com.gildeonbs.dslist.repository;

import com.gildeonbs.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Extendo o JpaRepository e passo o tipo da entidade e o tipo do ID da entidade
// Não preciso da anotação pois já estou extendendo/herdando
public interface GameRepository extends JpaRepository<Game, Long> {

}


