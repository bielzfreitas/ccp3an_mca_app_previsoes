package br.usjt.temperatura.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.temperatura.model.Temperatura;
import br.usjt.temperatura.repository.TemperaturaRepository;

@Controller
public class TemperaturasController {

	@Autowired
	private TemperaturaRepository service;

	@GetMapping("/temperaturas")
	private ModelAndView listarTemperaturas() throws IOException {
		System.out.println("Entrando em /previsoes");
		ModelAndView modelAndView = new ModelAndView("lista_temperaturas");
		List<Temperatura> temperaturas = service.findAll();
		modelAndView.addObject("temperaturas", temperaturas);
		return modelAndView;
	}
}
