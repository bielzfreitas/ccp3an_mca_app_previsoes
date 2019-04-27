package br.usjt.temperatura.repository;

import br.usjt.temperatura.model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperaturaApplicationRepository extends JpaRepository<Temperatura, Long>{

}
