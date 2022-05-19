/*
package com.rest.webapp.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.rest.webapp")
@PropertySource("classpath:application.properties")
public class DBConfig {
    @Autowired
    Environment env;
    private final String URL="spring.datasource.url";
    private final String USER="spring.datasource.username";
    private final String DRIVER="spring.datasource.driver-class-name";
    private final String PASSWORD="spring.datasource.password";



    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(env.getProperty(URL));
        driverManagerDataSource.setUsername(env.getProperty(USER));
        driverManagerDataSource.setPassword(env.getProperty(PASSWORD));
        driverManagerDataSource.setDriverClassName(env.getProperty(DRIVER));

        return driverManagerDataSource;
    }

   */
/* @Bean
    @Lazy
    JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }*//*

}
*/
