package br.usjt.temperatura.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.temperatura.model.Cidade;
import br.usjt.temperatura.model.Temperatura;

@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Long>{
		public Temperatura findByLatitude (String latitude);
		public Temperatura findByLongitude (String longitude);
		public List <Cidade> queryByNome (String nome);
		}