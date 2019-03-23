package br.edu.ifpb.servicofuncionario.repositories;

import br.edu.ifpb.servicofuncionario.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    public Funcionario findByLogin(String login);
    public List<Funcionario> findAllByGerente(String gerente);
}
