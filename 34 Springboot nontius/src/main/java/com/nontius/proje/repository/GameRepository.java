package com.nontius.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nontius.proje.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, String> {

}
