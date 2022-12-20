package com.football.football.service;

import com.football.football.controller.mapper.PlayAgainstMapper;
import com.football.football.controller.response.PlayAgainstResponse;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.model.PlayAgainst;
import com.football.football.model.Player;
import com.football.football.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private PlayAgainstRepository playAgainstRepository;
    private PlayAgainstMapper mapper;
    public List<PlayAgainst> getPlay(){
        return playAgainstRepository.findAll();
    }

    @Transactional
    public List<PlayAgainst> savePlay(List<PlayAgainst> toCreate){
        return playAgainstRepository.saveAll(toCreate);
    }

    @Transactional
    public List<PlayAgainst> updatePlay(List<PlayAgainst> toUpdate){
        return playAgainstRepository.saveAll(toUpdate);
    }

    public ResponseEntity<PlayAgainstResponse> deletePlay(int PlayAgainstId){
        Optional<PlayAgainst> optional =playAgainstRepository.findById(Integer.valueOf(PlayAgainstId));
        if (optional.isPresent()){
            playAgainstRepository.delete(optional.get());
            return ResponseEntity.status(200).body(mapper.toRest(optional.get()));
        }else {
            return ResponseEntity.status(404)
                    .header("Player "+ PlayAgainstId+" not found")
                    .body(null);
        }
    }
}
