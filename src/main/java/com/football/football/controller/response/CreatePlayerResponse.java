package com.football.football.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreatePlayerResponse {
    private String name;
    private Integer number;
}
