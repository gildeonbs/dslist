package com.gildeonbs.dslist.repository;

import com.gildeonbs.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

// I extend JpaRepository and specify the entity type and the entity ID type
// I don’t need the annotation because I’m already extending/inheriting
public interface GameListRepository extends JpaRepository<GameList, Long> {

}


