package com.football.football.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PlayAgainst {
    @Id
    private int id;
    @OneToOne
    @JoinColumn(name = "id_team")
    private Team id_team;
    @OneToOne
    @JoinColumn(name = "id_andversary")
    private Team id_opponent;
    private Date datetime;
    private String stadium;
}
