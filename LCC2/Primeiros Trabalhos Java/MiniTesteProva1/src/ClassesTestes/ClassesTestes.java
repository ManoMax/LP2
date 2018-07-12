package ClassesTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Classes.Colecao;

public class ClassesTestes {
	
	public static Colecao[] series = new Colecao[100];
	public int pos = 0;
	
	@Before
	public void criaColecao() {
		this.series[pos] = new Colecao("The Walking Dead", 10);
		pos += 1;
	}
	
	@Test
	public void CadastraEpsodio() {
		series[0].adicionaBlueray("Episodio I", 58);
		assertEquals("Episodio I 58 minutos.", series[0].listaBluray("Episodio I"));
		
		series[0].adicionaBlueray("Episodio II", 42);
		assertEquals("Episodio II 42 minutos.", series[0].listaBluray("Episodio II"));
	}
	
	@Test
	public void PopularidadePorSerie() {
		for (int i = 0; i < 100; i++) {
			if (series[i] != null) {
				assertEquals("The Walking Dead alugado 0 vezes. POUCO POPULAR", series[i].getPopularidade());
			}
		}
	}
	
//	@Test
//	public void PopularidadePorEpisodio() {
//		assertEquals("Episodio I alugado 0 vezes. POUCO POPULAR\nEpisodio II alugado 0 vezes. POUCO POPULAR\n", series[0].popularidadeEpisodio());
//	}
	
}
