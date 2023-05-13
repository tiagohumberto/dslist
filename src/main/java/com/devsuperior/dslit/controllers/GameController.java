package com.devsuperior.dslit.controllers;


import com.devsuperior.dslit.dto.GameDTO;
import com.devsuperior.dslit.dto.GameMinDTO;
import com.devsuperior.dslit.entities.Game;
import com.devsuperior.dslit.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findByid(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
