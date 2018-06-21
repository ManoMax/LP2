package classesTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Aluno;
import classes.Grupo;

public class GrupoTest {
	
	private Grupo grupo;
	
	// Construtor (Criação) de Grupo:
	@Before
	public void construtorGrupo() {
		grupo = new Grupo("F1");
	}
	
	// Teste de nome e criação do Grupo:
	@Test
	public void testeCriacaoDoGrupo() {
		assertEquals("f1", grupo.getNome());
	}
	
	// Teste de Alocação de Alunos e Impressão do Grupo:
	@Test
	public void testeAlocarAluno() {
		// Imprimir Grupo Vazio:
		assertEquals("Alunos do grupo F1:\n", grupo.imprimirGrupo());
		
		// Criando Alunos:
		Aluno aluno1 = new Aluno("44", "Max", "CC");
		Aluno aluno2 = new Aluno("55", "Zaca", "CC");
		Aluno aluno3 = new Aluno("66", "Lukas", "CC");
		
		// Alocando 1 Aluno:
		grupo.alocarAluno(aluno1);
		
		// Imprimindo Grupo com 1 Aluno:
		assertEquals("Alunos do grupo F1:\n* 44 - Max - CC\n", grupo.imprimirGrupo());
		
		// Alocando mais de 1 Aluno:
		grupo.alocarAluno(aluno2);
		grupo.alocarAluno(aluno3);
		
		// Imprimir Grupo com mais de 1 Aluno:
		assertEquals("Alunos do grupo F1:\n* 44 - Max - CC\n* 55 - Zaca - CC\n* 66 - Lukas - CC\n", grupo.imprimirGrupo());
	}

}
