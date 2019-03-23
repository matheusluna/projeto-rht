package br.edu.ifpb.servicofuncionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicoFuncionarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicoFuncionarioApplication.class, args);
    }

}
