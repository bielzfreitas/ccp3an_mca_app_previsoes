package br.usjt.temperatura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.usjt.temperatura.model.Temperatura;
import br.usjt.temperatura.repository.TemperaturaRepository;

@Service
public class TemperaturaService {

	@Autowired private TemperaturaRepository repository;
	public List<Temperatura> findAll() {
		return repository.findAll();
	}
}