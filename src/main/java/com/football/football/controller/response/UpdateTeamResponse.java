package com.football.football.controller.response;

import com.football.football.model.Player;
import com.football.football.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class UpdateTeamResponse {
    private String name;
    private List<Player> player;
    private List<Sponsor> sponsor;
}
