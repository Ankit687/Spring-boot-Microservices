package com.watcix.questionservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Question-Service",
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
public class QuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionServiceApplication.class, args);
    }

}
