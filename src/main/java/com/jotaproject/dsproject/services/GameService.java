package com.jotaproject.dsproject.services;

import com.jotaproject.dsproject.dto.GameMinDTO;
import com.jotaproject.dsproject.entities.Game;
import com.jotaproject.dsproject.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> gameList = gameRepository.findAll();
        List<GameMinDTO> result = gameList.stream().map(x -> new GameMinDTO(x)).toList();

        return result;
    }
}
