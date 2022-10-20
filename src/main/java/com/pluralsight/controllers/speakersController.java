package com.pluralsight.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.model.Session;
import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

@RestController
@RequestMapping("/api/v1/speakers")

public class speakersController {

  @Autowired
  private SpeakerRepository speakerRepository;
  
  // lay toan bo 
  @GetMapping
  public List<Speaker> list(){
    return speakerRepository.findAll();
  }
  
  @GetMapping
  @RequestMapping("{id}")
  public Speaker get(@PathVariable Long id)
  {
    return speakerRepository.getOne(id);
  }
  
  @PostMapping
  public Speaker create(@RequestBody Speaker speaker) {
    return speakerRepository.saveAndFlush(speaker);
    
  }
  
  @RequestMapping(value ="{id}",method = RequestMethod.DELETE)
  public void delete(@PathVariable Long id) {
   speakerRepository.deleteById(id);
 }
  
  @RequestMapping(value ="{id}",method = RequestMethod.PUT)
  public Speaker update(@PathVariable Long id , @RequestBody Speaker speaker) {
    Speaker existingSpeaker = speakerRepository.getOne(id);
    BeanUtils.copyProperties(speaker, existingSpeaker,"speaker_id");
    return speakerRepository.saveAndFlush(existingSpeaker);
  }
}
