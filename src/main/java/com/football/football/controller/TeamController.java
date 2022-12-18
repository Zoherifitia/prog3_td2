package com.football.football.controller;

import com.football.football.controller.mapper.TeamMapper;
import com.football.football.controller.response.CreateTeamResponse;
import com.football.football.controller.response.TeamResponse;
import com.football.football.controller.response.UpdateTeamResponse;
import com.football.football.model.Team;
import com.football.football.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController{
    private TeamService teamService;
    private TeamMapper teamMapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams(){
        return teamService.getTeams().stream().map(teamMapper::toRest).toList();
    }

    @PostMapping("/teams")
    public List<TeamResponse> createTeams(@RequestBody List<CreateTeamResponse> toCreate){
        List<Team> domain =toCreate.stream().map(teamMapper::toDomain).toList();
        return teamService.saveTeams(domain).stream().map(teamMapper::toRest).toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeams(@RequestBody List<UpdateTeamResponse> toUpdate){
        List<Team> domain =toUpdate.stream().map(teamMapper::toDomain).toList();
        return teamService.updateTeams(domain).stream().map(teamMapper::toRest).toList();
    }

    @DeleteMapping("/teams/{id}")
    public ResponseEntity<TeamResponse> deleteTeam(@PathVariable Integer id){
        return teamService.deleteTeam(id);
    }


}
