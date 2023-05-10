package com.grendtri;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import java.util.TimeZone;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
        //org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        //org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)

//@SpringBootApplication
public class JavaTutoriasCommonDataApplication {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    //psvm
    public static void main(String[] args) {

        // devtools active isActive
        // System.setProperty("spring.devtools.restart.enabled","true");

        //Disables headless JoptionPane
        System.setProperty("java.awt.headless","false");

        SpringApplication.run(JavaTutoriasCommonDataApplication.class, args);
    } //end psvm
} //end class
