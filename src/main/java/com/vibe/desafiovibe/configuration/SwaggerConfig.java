package com.vibe.desafiovibe.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.vibe.desafiovibe.resources"))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false)
		        .globalResponseMessage(RequestMethod.GET, responseMessageForGET())
		        .apiInfo(apiInfo());
	}

	private List<ResponseMessage> responseMessageForGET() {	
		return new ArrayList<ResponseMessage>() {
			private static final long serialVersionUID = 1L;
		{
	        add(new ResponseMessageBuilder()
	            .code(500)
	            .message("500 message")
	            .build());
	    }};
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	            .title("API DESAFIO VIBE")
	            .description("API que permite listar e visualizar os detalhes de um parlamentar e suas despesas.")
	            .version("1.0.0")
	            .contact(new Contact(
	            		"Filipe Castro", 
	            		"https://github.com/CastroFilipe/api-dep", 
	            		"filipe.castro.dev@gmail.com"))
	            .build();
	}
}