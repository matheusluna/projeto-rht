package br.edu.ifpb.servicogerente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicoGerenteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicoGerenteApplication.class, args);
    }

}
