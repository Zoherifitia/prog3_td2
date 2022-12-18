package com.football.football.controller.mapper;

import com.football.football.controller.response.CreateTeamResponse;
import com.football.football.controller.response.TeamResponse;
import com.football.football.controller.response.UpdateTeamResponse;
import com.football.football.model.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    public TeamResponse toRest(Team domain){
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Team toDomain(CreateTeamResponse rest){
        return Team.builder()
                .name(rest.getName())
                .build();
    }

    public Team toDomain(UpdateTeamResponse rest){
        return Team.builder()
                .name(rest.getName())
                .build();
    }
}
