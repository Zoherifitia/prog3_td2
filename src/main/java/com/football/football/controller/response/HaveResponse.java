package com.football.football.controller.response;

import com.football.football.model.Sponsor;
import com.football.football.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HaveResponse {
    private Team team;
    private Sponsor sponsor;
}
