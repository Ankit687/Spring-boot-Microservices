package com.watcix.quizservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(
        info = @Info(
                title = "Quiz-Service",
                version="1.0.0",
                description = "Quiz Application",
                termsOfService = "https://devkit-ankit.tech/",
                contact = @Contact(
                        name = "Mr Ankit Kumar",
                        email = "ankit687kumar@gmail.com"
                ),
                license = @License(
                        name = "licence",
                        url = "https://devkit-ankit.tech/"
                )
        )
)
public class QuizServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizServiceApplication.class, args);
    }

}
