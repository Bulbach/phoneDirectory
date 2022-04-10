package com.alex.config;

import com.alex.dto.HumanDto;
import com.alex.dto.PhoneDto;
import com.alex.model.Human;
import com.alex.model.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@ComponentScan("com.alex")
@EnableJpaRepositories
public class MyConfiguration {

    @Bean
    public Human humanBean(){
        return new Human();
    }

    @Bean
    public Phone phoneBean(){
        return new Phone();
    }
    @Bean
    public HumanDto humanDtoBean(){
        return new HumanDto();
    }
    @Bean
    public PhoneDto phoneDtoBean(){
        return new PhoneDto();
    }
//    @Bean
//    public HumanMapper humanMapperBean(){
//        return new HumanMapper();
//    }
//    @Bean
//    public PhoneMapper phoneMapperBean(){
//        return new PhoneMapper();
//    }
//    @Bean
//    public HumanService humanServiceBean(HumanDaoImpl humanDao, HumanMapper humanMapper){
//        return new HumanService(humanDao,humanMapper);
//    }

//    @Bean
//    public PhoneService phoneServiceBean(PhoneDaoImpl phoneDao , PhoneMapper phoneMapper){
//        return new PhoneService(phoneDao,phoneMapper);
//    }
//    @Bean
//    public HumanController humanControllerBean(HumanService humanService){
//        return new HumanController(humanService);
//    }

//    @Bean
//    public PhoneController phoneControllerBean(PhoneService phoneService){
//        return new PhoneController(phoneService);
//    }
}
