package br.edu.ifpb.apigateway.feingclients;

import br.edu.ifpb.apigateway.entities.Gerente;
import br.edu.ifpb.apigateway.entities.Login;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "gerente", path = "/gerente")
public interface Clients {
    @PostMapping("/cadastro")
    public void create(@RequestBody Gerente gerente);

    @GetMapping
    public List<Gerente> list();

    @PostMapping("/login")
    public Gerente login(@RequestBody Login login);
}
