package br.edu.ifpb.apigateway.feingclients;

import br.edu.ifpb.apigateway.entities.Funcionario;
import br.edu.ifpb.apigateway.entities.Login;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "funcionario", path = "/funcionario")
public interface FuncionarioClient {

    @PostMapping("/cadastro")
    public void create(@RequestBody Funcionario funcionario);

    @PostMapping("/gerente")
    public List<Funcionario> listByGerente(@RequestBody String gerente);

    @PostMapping("/login")
    public Funcionario login(@RequestBody Login login);

    @GetMapping
    public List<Funcionario> list();


}
