package br.usjt.temperatura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.temperatura.model.Cidade;
import br.usjt.temperatura.repository.CidadeRepository;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository repo;

	public void salvar(Cidade cidade) {
		repo.save(cidade);
	}

	public List<Cidade> listarCidade() {
		return repo.findAll();
	}

	public void excluir(Cidade cidade) {
		repo.delete(cidade);
	}

}
