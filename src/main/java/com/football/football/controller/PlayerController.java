package com.football.football.controller;

import com.football.football.controller.mapper.PlayerMapper;
import com.football.football.controller.response.CreatePlayerResponse;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.controller.response.UpdatePlayerResponse;
import com.football.football.model.Player;
import com.football.football.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;
    private PlayerMapper playerMapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers(){
        return playerService.getPlayers().stream()
                .map(playerMapper::toRest)
                .toList();
    }

    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(@RequestBody List<CreatePlayerResponse> toCreate){
        List<Player> domain =toCreate.stream()
                .map(playerMapper::toDomain)
                .toList();
        return playerService.savePlayers(domain).stream().map(playerMapper::toRest).toList();
    }

    @PutMapping("/players")
    public List<PlayerResponse> UpdatePlayers(@RequestBody List<UpdatePlayerResponse> toUpdate){
        List<Player> domain =toUpdate.stream()
                .map(playerMapper::toDomain)
                .toList();
        return playerService.updatePlayers(domain).stream().map(playerMapper::toRest).toList();
    }

    @DeleteMapping("/players/{id}")
    private ResponseEntity<PlayerResponse> deletePlayer(@PathVariable Integer id){
        return playerService.deletePlayer(id);
    }

}
