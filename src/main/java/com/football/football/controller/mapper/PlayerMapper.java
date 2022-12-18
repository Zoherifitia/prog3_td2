package com.football.football.controller.mapper;

import com.football.football.controller.response.CreatePlayerResponse;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.controller.response.UpdatePlayerResponse;
import com.football.football.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerResponse toRest(Player domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .number(domain.getNumber())
                .build();
    }

    public Player toDomain(CreatePlayerResponse rest){
        return Player.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }

    public Player toDomain(UpdatePlayerResponse rest){
        return Player.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }


}
