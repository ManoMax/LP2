package prova;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AcademiaTest {
	private Academia academia;
	
	@Before
	public void criaAcademia() {
		academia = new Academia("Fitness");
	}
	
	@Test
	public void testAnalisaSePodeAdicionarMaisSemTerAdicionado() {
		assertTrue(academia.analisaSePodeAdicionarMais());
	}
	
	@Test
	public void testAnalisaSePodeAdicionarMaisNoLimite() {
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("a", 0);
		Exercicio c = new Exercicio("a", 0);
		Exercicio[] aa = {a, b, c};
		for(int i = 0; i < 3; i++) {
			this.academia.adicionaExercicio(aa[i]);
		}
		assertTrue(this.academia.analisaSePodeAdicionarMais());
	}
	
	@Test
	public void testAnalisaSePodeAdicionarMaisPassouLimite() {
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("a", 0);
		Exercicio c = new Exercicio("a", 0);
		Exercicio d = new Exercicio("a", 0);
		Exercicio[] aa = {a, b, c, d};
		for(int i = 0; i < 4; i++) {
			this.academia.adicionaExercicio(aa[i]);
		}
		assertFalse(this.academia.analisaSePodeAdicionarMais());
	}
	
	@Test
	public void testAdicionaExercicio() {
		Exercicio a = new Exercicio("a", 0);
		assertTrue(this.academia.adicionaExercicio(a));
	}
	
	@Test
	public void testAdicionaExercicioPassouDoLimite() {
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("a", 0);
		Exercicio c = new Exercicio("a", 0);
		Exercicio d = new Exercicio("a", 0);
		Exercicio[] aa = {a, b, c};
		for(int i = 0; i < 3; i++) {
			this.academia.adicionaExercicio(aa[i]);
		}
		assertTrue(this.academia.adicionaExercicio(d));
	}
	
	@Test
	public void testAdicionaExercicioNoLimite() {
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("a", 0);
		Exercicio c = new Exercicio("a", 0);
		Exercicio d = new Exercicio("a", 0);
		Exercicio e = new Exercicio("a", 0);
		Exercicio[] aa = {a, b, c, d};
		for(int i = 0; i < 4; i++) {
			this.academia.adicionaExercicio(aa[i]);
		}
		assertFalse(this.academia.adicionaExercicio(e));
	}
	
	@Test
	public void testListaExercicios() {
		String[] lista = new String[2];
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("a", 0);
		this.academia.adicionaExercicio(a);
		this.academia.adicionaExercicio(b);
		lista[0] = String.format("%d - %s", 1, a.toString());
		lista[1] = String.format("%d - %s", 2, b.toString());
		assertArrayEquals(this.academia.listaExercicios(), lista);
	}
	
	@Test
	public void testListaExerciciosSemExercicios() {
		String[] lista = new String[0];
		assertArrayEquals(this.academia.listaExercicios(), lista);
	}
	
	@Test
	public void testAnalisaNomeInvalido() {
		Exercicio a = new Exercicio("a", 0);
		Exercicio b = new Exercicio("b", 0);
		this.academia.adicionaExercicio(a);
		this.academia.adicionaExercicio(b);
		assertTrue(this.academia.analisaNomeInvalido("a"));
	}
	
	@Test
	public void testCalcularCalorias() {
		String[] nomes = {"a", "b"};
		Exercicio a = new Exercicio("a", 1);
		Exercicio b = new Exercicio("b", 1);
		this.academia.adicionaExercicio(a);
		this.academia.adicionaExercicio(b);
		assertEquals(4, this.academia.calcularCalorias(nomes, 2));
	}
	
	//@Test
	//public void testCalcularCaloriasNomeInvalido() {
	//	String[] nomes = {"c", "b"};
	//	Exercicio a = new Exercicio("a", 1);
	//	Exercicio b = new Exercicio("b", 1);
	//	this.academia.adicionaExercicio(a);
	//	this.academia.adicionaExercicio(b);
	//	try {
	//		this.academia.calcularCalorias(nomes, 2);
	//		fail("Errado");
	//	}catch(IllegalArgumentException exp) {
			
	//	}
//	}
	

}
