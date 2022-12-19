package com.football.football.controller.response;

import com.football.football.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id;
    private String name;
    private Sponsor sponsor;
}
