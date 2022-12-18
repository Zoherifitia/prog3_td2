package com.football.football.repository;

import com.football.football.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor,Integer> {
}
