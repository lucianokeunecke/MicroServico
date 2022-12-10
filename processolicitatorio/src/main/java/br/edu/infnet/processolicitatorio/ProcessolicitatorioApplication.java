package br.edu.infnet.processolicitatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProcessolicitatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessolicitatorioApplication.class, args);
	}

}
