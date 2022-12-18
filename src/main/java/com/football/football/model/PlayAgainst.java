package com.football.football.model;

import lombok.*;

import javax.persistence.Entity;
import java.time.Instant;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PlayAgainst {
    private Instant dateTime;
    private String stadium;
}
