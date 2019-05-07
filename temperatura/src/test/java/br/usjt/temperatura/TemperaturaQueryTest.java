package br.usjt.temperatura;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.temperatura.repository.CidadeRepository;
import br.usjt.temperatura.model.Cidade;

@RunWith (SpringRunner.class)
@SpringBootTest
public class TemperaturaQueryTest {
	@Autowired
	private CidadeRepository cidadeRepo;
	@Test
	public void findOneTest() {
		Cidade a = cidadeRepo.buscarPeloNome("São Paulo");
		System.out.println(a);
	}
}