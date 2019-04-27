package br.usjt.temperatura.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import br.usjt.temperatura.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	public Cidade buscarPeloNomeELongitudeELatitude (@Param ("nome") String nome,
			@Param ("longitude") String longitude, @Param ("latitude") String latitude);
	@Async
	public Future < List <Cidade> > findByNome (String nome);
	
	@Async
	public Future < List <Cidade> > findByLatitude (String latitude);
	
	@Async
	public Future < List <Cidade> > findByLongitude (String longitude);
	
	@Query ("SELECT a FROM Cidade a WHERE a.latitude = ?1")
	public List <Cidade> buscarPelaLatitude (String latitude);
	
	@Query ("SELECT a FROM Cidade a WHERE a.longitude = ?1")
	public List <Cidade> buscarPelaLongitude (String longitude);
	
	
}

