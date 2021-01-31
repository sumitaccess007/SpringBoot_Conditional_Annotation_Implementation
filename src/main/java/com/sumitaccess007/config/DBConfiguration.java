package com.sumitaccess007.config;

import com.sumitaccess007.condition.DBQACondition;
import com.sumitaccess007.condition.DBUATCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DBConfiguration {

    @Bean
    @Profile("dev")
    public void connectDEVDB(){
        System.out.println("In method connectDEVDB()");
    }

    @Bean
    @Conditional(DBQACondition.class)
    public void connectQADB(){
        System.out.println("In method connectQADB()");
    }

    @Bean
    @Conditional(DBUATCondition.class)
    public void connectUATDB(){
        System.out.println("In method connectUATDB()");
    }

    @Bean
    @Profile("prod")
    public void connectPRODDB(){
        System.out.println("In method connectPRODDB()");

    }


}
