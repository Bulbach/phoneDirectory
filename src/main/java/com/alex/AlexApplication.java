package com.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@EnableAutoConfiguration
public class AlexApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlexApplication.class,args);
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
//                (MyConfiguration.class);
//      for (String item : ctx.getBeanDefinitionNames()){
//          System.out.println(item);
//      }

    }
}
