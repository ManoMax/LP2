package classesTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Aluno;

public class AlunoTest {
	
	private Aluno aluno;
	
	// Representação de um Aluno, com matricula, nome e Curso:
	@Before
	public void constroiAluno() {
		aluno = new Aluno("100", "Sniper", "DOTA Federal of CG");
	}
	
	// Teste de Exibir Aluno:
	@Test
	public void testeExibirAluno() {
		assertEquals("100 - Sniper - DOTA Federal of CG", aluno.exibirAluno());
	}
	
	// Teste de Gets:
	@Test
	public void testeGetName() {
		assertEquals("Sniper", aluno.getName());
	}
	
	// Teste de Get Matricula:
	@Test
	public void testeGetMatricula() {
		assertEquals("100", aluno.getMatricula());
	}

}
