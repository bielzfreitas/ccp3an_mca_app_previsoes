package br.usjt.temperatura.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.temperatura.model.Usuario;
import br.usjt.temperatura.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request, Usuario usuario) {
		System.out.println("Verificando se o usuario existe");
		
		if (loginService.logar(usuario)) {
			System.out.println("Entrando");
			request.getSession().setAttribute("usuarioLogado", usuario);
			System.out.println("Redirecionando para previsoes");
			return "redirect:previsoes";
		}
		
		else 
		{
			return "login";
		}
	}

}