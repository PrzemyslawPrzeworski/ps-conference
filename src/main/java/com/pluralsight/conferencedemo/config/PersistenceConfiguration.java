package com.pluralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/conference_demo");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("root");
        System.out.println("My custom datasource bean has been initialized and set");
        return dataSourceBuilder.build();
    }
}
