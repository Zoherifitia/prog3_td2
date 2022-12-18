package com.football.football.service;

import com.football.football.controller.mapper.SponsorMapper;
import com.football.football.controller.response.PlayerResponse;
import com.football.football.controller.response.SponsorResponse;
import com.football.football.model.Player;
import com.football.football.model.Sponsor;
import com.football.football.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private SponsorRepository sponsorRepository;
    private SponsorMapper sponsorMapper;

    public List<Sponsor> getSponsors(){
        return sponsorRepository.findAll();
    }

    @Transactional
    public List<Sponsor> saveSponsors(List<Sponsor> toCreate){
        return sponsorRepository.saveAll(toCreate);
    }

    @Transactional
    public List<Sponsor> updateSponsors(List<Sponsor> toUpdate){
        return sponsorRepository.saveAll(toUpdate);
    }

    public ResponseEntity<SponsorResponse> deleteSponsor(int SponsorId){
        Optional<Sponsor> optional =sponsorRepository.findById(Integer.valueOf(SponsorId));
        if (optional.isPresent()){
            sponsorRepository.delete(optional.get());
            return ResponseEntity.status(200).body(sponsorMapper.toRest(optional.get()));
        }else {
            return ResponseEntity.status(404)
                    .header("Sponsor "+ SponsorId+" not found")
                    .body(null);
        }
    }
}
