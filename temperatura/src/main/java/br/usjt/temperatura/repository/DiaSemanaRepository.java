package br.usjt.temperatura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.usjt.temperatura.model.DiaSemana;
@Service
public interface DiaSemanaRepository extends JpaRepository<DiaSemana, Long>{

}