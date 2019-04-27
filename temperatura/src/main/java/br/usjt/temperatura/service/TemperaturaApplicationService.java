package br.usjt.temperatura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.temperatura.model.Temperatura;
import br.usjt.temperatura.repository.TemperaturaApplicationRepository;

@Service
public class TemperaturaApplicationService {
	@Autowired
	private TemperaturaApplicationRepository tempRepo;

	public void salvar(Temperatura temperatura) {
		tempRepo.save(temperatura);
	}

	public List<Temperatura> listarTodos() {
		return tempRepo.findAll();
	}
}