package br.usjt.temperatura;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.temperatura.repository.CidadeRepository;;

@SpringBootTest
@RunWith (SpringRunner.class)
public class NamedQueryTest {
	@Autowired
	private CidadeRepository cidadeRepo;
	@Test
	public void test () {
		Cidade a = cidadeRepo.buscarPeloNomeELongitudeELatitude("São Paulo", "-46.6388 23" ,"-23.5489");
		System.out.println(a);
	}
}