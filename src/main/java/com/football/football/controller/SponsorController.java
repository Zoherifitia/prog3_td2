package com.football.football.controller;

import com.football.football.controller.mapper.SponsorMapper;
import com.football.football.controller.response.CreateSponsorResponse;
import com.football.football.controller.response.SponsorResponse;
import com.football.football.controller.response.UpdateSponsorResponse;
import com.football.football.model.Sponsor;
import com.football.football.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private SponsorService sponsorService;
    private SponsorMapper sponsorMapper;

    @GetMapping("/sponsors")
    public List<SponsorResponse> getSponsors(){
        return sponsorService.getSponsors().stream().map(sponsorMapper::toRest).toList();
    }

    @PostMapping("/sponsors")
    public List<SponsorResponse> createSponsors(@RequestBody List<CreateSponsorResponse> toCreate){
        List<Sponsor> domain =toCreate.stream().map(sponsorMapper::toDomain).toList();
        return sponsorService.saveSponsors(domain).stream().map(sponsorMapper::toRest).toList();
    }

    @PutMapping("/sponsors")
    public List<SponsorResponse> updateSponsors(@RequestBody List<UpdateSponsorResponse> toUpdate){
        List<Sponsor> domain =toUpdate.stream().map(sponsorMapper::toDomain).toList();
        return sponsorService.saveSponsors(domain).stream().map(sponsorMapper::toRest).toList();
    }

    @DeleteMapping("/sponsors/{id}")
    public ResponseEntity<SponsorResponse> deleteSponsor(@PathVariable Integer id){
        return sponsorService.deleteSponsor(id);
    }
}
