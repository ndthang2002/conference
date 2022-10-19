package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;


@Service("speakerService")

public class SpeakerServiceImpl implements SpeakerService {
   @Autowired
   private SpeakerRepository repository ;
  
   public SpeakerServiceImpl() {
     System.out.println("SpeakServiceImpl no args constructor");
   }
   
   
   public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
     repository = speakerRepository;
   }
   
   @PostConstruct
   private void initalize() {
     System.out.println("we are called after the constructor");
   }
   public List<Speaker> findAll(){
    return repository.findAll();
  }
 
  public void setRepository(SpeakerRepository repository) {
    this.repository = repository;
  }
  
}
