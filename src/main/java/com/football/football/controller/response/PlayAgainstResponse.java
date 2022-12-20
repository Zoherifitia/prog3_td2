package com.football.football.controller.response;

import com.football.football.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PlayAgainstResponse {
    private int id;
    private Team id_team;
    private Team id_opponent;
    private Date datetime;
}
