package com.football.football.controller.mapper;

import com.football.football.controller.response.CreateSponsorResponse;
import com.football.football.controller.response.SponsorResponse;
import com.football.football.controller.response.UpdateSponsorResponse;
import com.football.football.model.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class SponsorMapper {
    public SponsorResponse toRest(Sponsor domain){
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Sponsor toDomain(CreateSponsorResponse rest){
        return Sponsor.builder()
                .name(rest.getName())
                .build();
    }

    public Sponsor toDomain(UpdateSponsorResponse rest){
        return Sponsor.builder()
                .name(rest.getName())
                .build();
    }
}
