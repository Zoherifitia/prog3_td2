package com.football.football.controller;

import com.football.football.controller.mapper.PlayAgainstMapper;
import com.football.football.controller.response.*;
import com.football.football.model.PlayAgainst;
import com.football.football.model.Player;
import com.football.football.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private PlayAgainstService service;
    private PlayAgainstMapper mapper;

    @GetMapping("/playAgainst")
    public List<PlayAgainstResponse> getPlay(){
        return service.getPlay().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/playAgainst")
    public List<PlayAgainstResponse> createPlay(@RequestBody List<CreatePlayAgainstResponse> toCreate){
        List<PlayAgainst> domain =toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.savePlay(domain).stream().map(mapper::toRest).toList();
    }

    @PutMapping("/playAgainst")
    public List<PlayAgainstResponse> UpdatePlayers(@RequestBody List<UpdatePlayAgainstResponse> toUpdate){
        List<PlayAgainst> domain =toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.updatePlay(domain).stream().map(mapper::toRest).toList();
    }

    @DeleteMapping("/playeAgaist/{id}")
    private ResponseEntity<PlayAgainstResponse> deletePlayer(@PathVariable Integer id){
        return service.deletePlay(id);
    }
}
