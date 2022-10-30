package com.pluralsight.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Girl {
  @Value("${spring.datasource.url}")
private String app;
  @PostConstruct
  public void postConstruct() {
    System.out.println("sau khi khởi tạo sẽ chạy hàm này");
  }
  
  @PreDestroy
  public void preDestroy() {
    System.out.println(" doi tuong Girl truoc khi bi detroy thi chay ham nay ");
  }
  
}
