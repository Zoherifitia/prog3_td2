package com.football.football.controller.response;

import com.football.football.model.Player;
import com.football.football.model.Sponsor;
import com.football.football.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id;
    private String name;
    private List<Player> player;
    private List<Sponsor> sponsor;
}
