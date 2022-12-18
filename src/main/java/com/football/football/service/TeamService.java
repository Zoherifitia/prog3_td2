package com.football.football.service;


import com.football.football.controller.mapper.TeamMapper;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.controller.response.TeamResponse;
import com.football.football.model.Player;
import com.football.football.model.Team;
import com.football.football.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;
    private TeamMapper teamMapper;

    public List<Team> getTeams(){
        return teamRepository.findAll();
    }

    @Transactional
    public List<Team> saveTeams(List<Team> toCreate){
        return teamRepository.saveAll(toCreate);
    }

    @Transactional
    public List<Team> updateTeams(List<Team> toUpdate){
        return teamRepository.saveAll(toUpdate);
    }

    public ResponseEntity<TeamResponse> deleteTeam(int TeamId){
        Optional<Team> optional =teamRepository.findById(Integer.valueOf(TeamId));
        if (optional.isPresent()){
            teamRepository.delete(optional.get());
            return ResponseEntity.status(200).body(teamMapper.toRest(optional.get()));
        }else {
            return ResponseEntity.status(404)
                    .header("Team "+ TeamId+" not found")
                    .body(null);
        }
    }
}
