package br.edu.ifpb.servicofuncionario.controllers;

import br.edu.ifpb.servicofuncionario.entities.Funcionario;
import br.edu.ifpb.servicofuncionario.entities.Login;
import br.edu.ifpb.servicofuncionario.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastro")
    public void create(@RequestBody Funcionario funcionario){
        this.funcionarioService.create(funcionario);
    }

    @PostMapping("/gerente")
    public ResponseEntity<List<Funcionario>> listByGerente(@RequestBody String gerente){
        return ResponseEntity.ok(this.funcionarioService.listByGerente(gerente));
    }

    @PostMapping("/login")
    public ResponseEntity<Funcionario> login(@RequestBody Login login){
        Funcionario funcionario = this.funcionarioService.read(login.getLogin());
        if (funcionario != null){
            if (funcionario.getSenha().equals(login.getSenha())) return ResponseEntity.ok(funcionario);
            else return null;
        } else return null;

    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> list(){
        return ResponseEntity.ok(this.funcionarioService.list());
    }

}
