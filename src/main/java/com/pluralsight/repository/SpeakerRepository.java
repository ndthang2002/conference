package com.pluralsight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long>{
 List<Speaker> findAll();
}
