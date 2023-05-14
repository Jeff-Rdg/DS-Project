package com.jotaproject.dsproject.repositories;

import com.jotaproject.dsproject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
