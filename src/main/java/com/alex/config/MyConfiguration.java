package com.alex.config;

import com.alex.controllers.HumanController;
import com.alex.controllers.PhoneController;
import com.alex.mappers.HumanMapper;
import com.alex.mappers.HumanMapperImpl;
import com.alex.mappers.PhoneMapper;
import com.alex.mappers.PhoneMapperImpl;
import com.alex.service.HumanService;
import com.alex.service.PhoneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@ComponentScan
public class MyConfiguration {

    //todo читать про способы внедрения зависимостей
    @Bean
    public HumanMapper humanMapperBean(){
        return new HumanMapperImpl();
    }
    @Bean
    public PhoneMapper phoneMapperBean(){
        return new PhoneMapperImpl();
    }
    @Bean
    public HumanService humanServiceBean(){
        return new HumanService();
    }

    @Bean
    public PhoneService phoneServiceBean(){
        return new PhoneService();
    }
    @Bean
    public HumanController humanControllerBean(){
        return new HumanController();
    }

    @Bean
    public PhoneController phoneControllerBean(){
        return new PhoneController();
    }
}
