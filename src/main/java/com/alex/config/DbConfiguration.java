package com.alex.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
@Configuration
@PropertySource("classpath:application.properties")
public class DbConfiguration {
    @Autowired
    private Environment environment;

    public DbConfiguration() {
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }


    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(environment.getRequiredProperty("userName"));
        dataSource.setPassword(environment.getRequiredProperty("password"));
        dataSource.setURL(environment.getRequiredProperty("url"));
        return dataSource;
    }
}
