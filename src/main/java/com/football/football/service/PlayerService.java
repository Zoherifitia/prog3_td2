package com.football.football.service;

import com.football.football.controller.mapper.PlayerMapper;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.model.Player;
import com.football.football.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;
    private PlayerMapper playerMapper;

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    @Transactional
    public List<Player> savePlayers(List<Player> toCreate){
        return playerRepository.saveAll(toCreate);
    }

    @Transactional
    public List<Player> updatePlayers(List<Player> toUpdate){
        return playerRepository.saveAll(toUpdate);
    }

    public ResponseEntity<PlayerResponse> deletePlayer(int PlayerId){
        Optional<Player> optional =playerRepository.findById(Integer.valueOf(PlayerId));
        if (optional.isPresent()){
            playerRepository.delete(optional.get());
            return ResponseEntity.status(200).body(playerMapper.toRest(optional.get()));
        }else {
            return ResponseEntity.status(404)
                    .header("Player "+ PlayerId+" not found")
                    .body(null);
        }
    }

}
