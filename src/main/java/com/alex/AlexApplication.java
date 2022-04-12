package com.alex;

import com.alex.config.DbConfiguration;
import com.alex.config.MyConfiguration;
import com.alex.config.SwaggerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




//@EnableAutoConfiguration
public class AlexApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
                (MyConfiguration.class, SwaggerConfig.class, DbConfiguration.class);
      for (String item : ctx.getBeanDefinitionNames()){
          System.out.println(item);
      }

    }
}
