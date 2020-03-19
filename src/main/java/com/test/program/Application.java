package com.test.program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot
 *
 * @author Youngs
 * @version 1.0
 * @date 2019-12-20
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
