package br.usjt.temperatura;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.temperatura.repository.TemperaturaRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class TemperaturaQueryTest {
	@Autowired
	private TemperaturaRepository temperaturaRepo;
	@Test
	public void findOneTest() {
		Cidade a = temperaturaRepo.buscarPeloNome("São Paulo");
		System.out.println(a);
	}
}