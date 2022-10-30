package com.pluralsight.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component

@ConfigurationProperties(prefix = "loda")
public class Student {
  private String email;
  
  private String ten ;
  
}
