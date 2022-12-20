package com.football.football.controller.response;

import com.football.football.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class CreatePlayAgainstResponse {
    private Team id_team;
    private Team id_opponent;
    private Date datetime;
    private String stadium;
}
