package br.edu.ifpb.servicogerente.repositories;

import br.edu.ifpb.servicogerente.entities.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenteRepository extends JpaRepository<Gerente, Long> {
    public Gerente findByLogin(String login);
}
