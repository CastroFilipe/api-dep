package com.vibe.desafiovibe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiovibeApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(DesafiovibeApplication.class, args);
	}
	
//	@Autowired
//	private DeputadoService deputadoService;

	@Override
	public void run(String... args) throws Exception {
		//deputadoService.buscarDeputados(1,5).forEach(System.out::println);;
	}

}