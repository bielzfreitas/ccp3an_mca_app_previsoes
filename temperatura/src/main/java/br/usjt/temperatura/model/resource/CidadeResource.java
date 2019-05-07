package br.usjt.temperatura.model.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.temperatura.model.Cidade;
import br.usjt.temperatura.repository.CidadeRepository;

@RestController
@RequestMapping ("/Cidade")
public class CidadeResource {
	@Autowired
	private CidadeRepository cidadeRepo;
	@GetMapping ("/lista")
	public List <Cidade> todasAsCidades (){
		return cidadeRepo.findAll();
	}
	@GetMapping ("/{id}")
	public Cidade buscarPeloId (@PathVariable Long id) {
		return cidadeRepo.getOne(id);
	}
	@GetMapping ("/latitude")
	public Cidade buscarPelaLatitude (@PathVariable Long latitude) {
		return cidadeRepo.getOne(latitude);
	}
	@GetMapping ("/longitude")
	public Cidade buscarPelaLongitude (@PathVariable Long longitude) {
		return cidadeRepo.getOne(longitude);
	}
	@GetMapping ("/lista")
	public List <Cidade> buscarPelaLetra (@PathVariable Long  nome ){
		return cidadeRepo.findAll();
	}
	
	@PostMapping ("/salvar")
	public ResponseEntity<Cidade> salvar ( @RequestBody Cidade cidade, HttpServletResponse response) {
		Cidade l = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.
		fromCurrentServletMapping().path("/{id}").
		buildAndExpand(l.getId()).
		toUri();
		return ResponseEntity.created(uri).body(l);
	}
}
