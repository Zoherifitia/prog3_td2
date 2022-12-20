create table player
(
    id     serial,
    name varchar,
    number  varchar,
    primary key (id)
);

create table sponsor
(
    id serial,
    name varchar,
    primary key (id)
)

create table team
(
    id serial,
    name varchar,
    id_sponsor integer not null
            constraint sponsor_id references "sponsor"(id),
    id_player integer not null
        constraint player_id references "player"(id)
)

create table play_against
(
    id_team1 integer not
        constraint id_team1 references "team"(id),
    id_team2 integer not
                constraint id_team2 references "team"(id),
    datetime date,
    stadium varchar
)