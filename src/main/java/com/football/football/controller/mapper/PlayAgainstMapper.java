package com.football.football.controller.mapper;

import com.football.football.controller.response.*;
import com.football.football.model.PlayAgainst;
import com.football.football.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayAgainstMapper {
    public PlayAgainstResponse toRest(PlayAgainst domain){
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .id_team(domain.getId_team())
                .id_opponent(domain.getId_opponent())
                .datetime(domain.getDatetime())
                .build();
    }

    public PlayAgainst toDomain(CreatePlayAgainstResponse rest){
        return PlayAgainst.builder()
                .id_team(rest.getId_team())
                .id_opponent(rest.getId_opponent())
                .datetime(rest.getDatetime())
                .stadium(rest.getStadium())
                .build();
    }

    public PlayAgainst toDomain(UpdatePlayAgainstResponse rest){
        return PlayAgainst.builder()
                .id_team(rest.getId_team())
                .id_opponent(rest.getId_opponent())
                .datetime(rest.getDatetime())
                .stadium(rest.getStadium())
                .build();
    }

}
