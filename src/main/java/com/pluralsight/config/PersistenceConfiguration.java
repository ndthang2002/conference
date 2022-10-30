package com.pluralsight.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
  @Bean
  public DataSource dataSource() {
  DataSourceBuilder builder = DataSourceBuilder.create();
  builder.url("jdbc:postgresql://localhost:5432/conference_app");
  builder.username("postgres");
  builder.password("admin");
  System.out.println("My custom datasource bean has been initialize and set");
    return builder.build();
    
  }
}
