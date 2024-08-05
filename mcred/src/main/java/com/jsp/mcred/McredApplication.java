package com.jsp.mcred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title = "admin cred",version = "7.0",contact = @Contact(name = "vineeth",email = "vineethdr28@gmail.com")))
public class McredApplication {

	public static void main(String[] args) {
		SpringApplication.run(McredApplication.class, args);
	}

}
