package com.football.football.repository;

import com.football.football.model.PlayAgainst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayAgainstRepository extends JpaRepository<PlayAgainst,Integer> {
}
