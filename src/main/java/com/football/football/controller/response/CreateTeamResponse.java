package com.football.football.controller.response;

import com.football.football.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateTeamResponse {
    private String name;
    private Sponsor sponsor;
}
