/*
package com.ent.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("")
public class DatabaseConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("");
        dataSource.setUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public JdbcTemplate getSybase(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
*/
