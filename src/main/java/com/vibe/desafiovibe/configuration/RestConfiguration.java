package com.vibe.desafiovibe.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.vibe.desafiovibe.clients.DespesaClientImpl;
import com.vibe.desafiovibe.clients.interfaces.DespesaClient;

@Configuration
public class RestConfiguration {
	
	    @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	    
	    @Bean
	    public DespesaClient despesaClient() {
	        return new DespesaClientImpl();
	    }
}
