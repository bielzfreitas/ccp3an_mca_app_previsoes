package br.usjt.temperatura.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.temperatura.model.Temperatura;
import br.usjt.temperatura.service.TemperaturaApplicationService;

@Controller
public class TemperaturasController {
	@Autowired
	private TemperaturaApplicationService temperaturaService;
	
	@GetMapping("/temperatura")
	public ModelAndView listaPrevisao() {
		ModelAndView mv = new ModelAndView("view");
		List<Temperatura> temperatura = temperaturaService.listarTodos();
		mv.addObject("temperaturas", temperatura);
		mv.addObject(new Temperatura());
		return mv;
	}
	@PostMapping("/temperaturaadd")
	public String salvar(Temperatura temperaturas) {
		temperaturaService.salvar(temperaturas);
		return "redirect:/temperatura";
	}
}
