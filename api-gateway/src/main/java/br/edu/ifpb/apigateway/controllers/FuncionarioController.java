package br.edu.ifpb.apigateway.controllers;

import br.edu.ifpb.apigateway.entities.Funcionario;
import br.edu.ifpb.apigateway.entities.Login;
import br.edu.ifpb.apigateway.feingclients.FuncionarioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioClient funcionarioClient;

    @PostMapping("/cadastro")
    @CrossOrigin(value = "http://localhost:4200")
    public void create(@RequestBody Funcionario funcionario){
        this.funcionarioClient.create(funcionario);
    }

    @PostMapping("/gerente")
    @CrossOrigin(value = "http://localhost:4200")
    public List<Funcionario> listByGerente(@RequestBody String gerente){
        return this.funcionarioClient.listByGerente(gerente);
    }

    @PostMapping("/login")
    @CrossOrigin(value = "http://localhost:4300")
    public Funcionario login(@RequestBody Login login){
        return this.funcionarioClient.login(login);
    }

    @GetMapping
    public List<Funcionario> list(){
        return this.funcionarioClient.list();
    }
}
