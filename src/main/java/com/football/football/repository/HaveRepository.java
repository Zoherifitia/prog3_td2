package com.football.football.repository;

import com.football.football.model.Have;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HaveRepository extends JpaRepository<Have ,Integer> {
}
