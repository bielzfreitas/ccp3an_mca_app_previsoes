package br.usjt.temperatura;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.usjt.temperatura.repository.CidadeRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class AsyncQueryTest {
	@Autowired
	private CidadeRepository cidadeRepo;
	@Test
	public void testFindAllAssincrono () throws InterruptedException, ExecutionException {
		Future <List <Cidade> > future = cidadeRepo.findByNome("São Paulo");
		System.out.println("São Paulo");
		System.out.println("SPS");
		List <Cidade> cidade = future.get();
		for (Cidade cidade : cidades) {
			System.out.println(cidade);
		}
	}
}
