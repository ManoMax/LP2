/**
 * 
 */
package classesTestes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Sistema;

/**
 * @author Gabriel Max Vieira Matos
 *
 */
public class SistemaTest {
	
	private Sistema sistema;
	
	// Construtor (Criação) de um Sistema:
	@Before
	public void constroiSistema() {
		sistema = new Sistema();
	}
	
	// Cadastramento de Aluno Válido:
	@Test
	public void testeCadastrarAlunoValido() {
		assertTrue(sistema.cadastrarAluno("44", "Max", "CC"));
	}
	
	// Exibir Aluno:
	@Test
	public void testeExibicaoDeAluno() {
		// Exibir Aluno Inexistente:
		assertEquals("\nAluno não cadastrado.\n", sistema.exibirAluno("44"));
		
		// Exibir Aluno Cadastrado:
		sistema.cadastrarAluno("44", "Max", "CC");
		assertEquals("\n44 - Max - CC\n", sistema.exibirAluno("44"));
	}
	
	// Criação de Grupo:
	@Test
	public void testeNovoGrupo() {
		assertTrue(sistema.novoGrupo("Grupo 1"));
	}
	
	// Alocar Aluno:
	@Test
	public void testeAlocarAluno() {
		assertTrue(sistema.novoGrupo("Grupo 1"));
		assertTrue(sistema.cadastrarAluno("44", "Max", "CC"));
		assertTrue(sistema.alocarAluno("44", "Grupo 1"));
	}
	
	// Verifica Aluno:
	@Test
	public void testeVerificaAluno() {
		// Aluno não Cadastrado:
		assertFalse(sistema.verificaAluno("44"));
		
		// Aluno Cadastrado:
		sistema.cadastrarAluno("44", "Max", "CC");
		assertTrue(sistema.verificaAluno("44"));
	}
	
	// Imprimir Grupo:
	@Test
	public void testeImprimirGrupo() {
		// Grupo Não Cadastrado:
		assertEquals("\nGrupo não cadastrado.\n", sistema.imprimirGrupo("Grupo Não Cadastrado"));
		
		// Grupo Cadastrado, mas sem Aluno:
		assertTrue(sistema.novoGrupo("grupo 1"));
		assertEquals("\nAlunos do grupo Grupo 1:\n", sistema.imprimirGrupo("grupo 1"));
		
		// Grupo Cadastrado, com um Aluno Alocado:
		assertTrue(sistema.cadastrarAluno("44", "Max", "CC"));
		assertTrue(sistema.alocarAluno("44", "grupo 1"));
		assertEquals("\nAlunos do grupo Grupo 1:\n* 44 - Max - CC\n", sistema.imprimirGrupo("grupo 1"));
		
		// Grupo Cadastrado, com mais de um Aluno Alocado:
		assertTrue(sistema.cadastrarAluno("55", "Lukas", "CC"));
		assertTrue(sistema.alocarAluno("55", "grupo 1"));
		assertEquals("\nAlunos do grupo Grupo 1:\n* 44 - Max - CC\n* 55 - Lukas - CC\n", sistema.imprimirGrupo("grupo 1"));
		
	}
	
	// Registrar Resposta:
	@Test
	public void testeRegistrarResposta() {
		// Sem Cadastro do Aluno:
		assertFalse(sistema.registrarResposta("44"));
		
		// Com Cadastro do Aluno:
		assertTrue(sistema.cadastrarAluno("44", "Max", "CC"));
		assertTrue(sistema.registrarResposta("44"));
	}
	
	// Imprimir Alunos:
	@Test
	public void testeImprimirAlunos() {
		// Sem Aluno Registrado:
		assertEquals("", sistema.imprimirAlunos());
		
		// Com um Aluno Registrado:
		assertTrue(sistema.cadastrarAluno("44", "Max", "CC"));
		assertTrue(sistema.registrarResposta("44"));
		assertEquals("1. 44 - Max - CC\n", sistema.imprimirAlunos());
		
		// Com mais de um Aluno Registrado:
		assertTrue(sistema.cadastrarAluno("55", "Zaca", "CC"));
		assertTrue(sistema.registrarResposta("55"));
		assertEquals("1. 44 - Max - CC\n2. 55 - Zaca - CC\n", sistema.imprimirAlunos());
	}
	
	// Exceptions:
	
	// Cadastramento inválido:
	@Test (expected = IllegalArgumentException.class)
	public void testeCadastrarAlunoInvalido(){
		// Por falta de Matricula:
		sistema.cadastrarAluno("", "Max", "CC");
		
		// Por falta de Nome:
		sistema.cadastrarAluno("44", "", "CC");
		
		// Por falta de Curso:
		sistema.cadastrarAluno("44", "Max", "");
	}
	
	// Exibição de Aluno inválida, por Matricula Vazia (Invalida):
	@Test (expected = IllegalArgumentException.class)
	public void testeExibirAlunoInvalido(){
		sistema.exibirAluno("");
		sistema.exibirAluno(" ");
		sistema.exibirAluno("  ");
	}

	// Criação de Grupo inválida, por nome vazio (inválido):
	@Test (expected = IllegalArgumentException.class)
	public void testeCriarGrupoInvalido() {
		sistema.novoGrupo("");
		sistema.novoGrupo(" ");
		sistema.novoGrupo("  ");
	}

	// Alocação de Aluno inválida:
	@Test (expected = IllegalArgumentException.class)
	public void testeAlocacaoInvalida() {
		// Por Matricula Vazia (Invalida):
		sistema.alocarAluno("", "Grupo 1");
		
		// Por Grupo Vazio (Invalido):
		sistema.alocarAluno("44", "");
	}

	// Verificação de Aluno inválida:
	@Test (expected = IllegalArgumentException.class)
	public void testeVerificacaoAlunoInvalida() {
		sistema.verificaAluno("");
		sistema.verificaAluno(" ");
		sistema.verificaAluno("  ");
	}
	
	// Impressão de Grupo inválida:
	@Test (expected = IllegalArgumentException.class)
	public void testeImpressaoInvalida() {
		sistema.imprimirGrupo("");
		sistema.imprimirGrupo(" ");
		sistema.imprimirGrupo("  ");
	}

	// Registro de Resposta inválido:
	@Test (expected = IllegalArgumentException.class)
	public void testeRegistrarRespostaInvalida() {
		sistema.registrarResposta("");
		sistema.registrarResposta(" ");
		sistema.registrarResposta("  ");
	}

}
