package com.football.football.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UpdatePlayerResponse {
    private String name;
    private Integer number;
}
