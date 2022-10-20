package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Session;
import com.pluralsight.model.Speaker;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

}
