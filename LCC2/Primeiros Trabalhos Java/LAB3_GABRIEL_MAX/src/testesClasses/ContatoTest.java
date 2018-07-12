package testesClasses;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Contato;

public class ContatoTest {
	
	private Contato contato;
	
	// Representação de um Contato, com Nome, Sobrenome e Telefone.
	@Before
	public void criaContato() {
		contato = new Contato("Contato", "Para Testes", "1234-5678");
	}
	
	// Teste Construtor de Contato.
	public void constroiContato() {
		Contato pessoa = new Contato("Uma", "Pessoa", "Sem Numero");
		assertEquals("Uma Pessoa - Sem Numero\n", pessoa.toString());
	}
	
	// Teste de Alteração de informação.
	@Test
	public void testeAlteraContato() {
		contato = new Contato("Novo Contato", "de Testes", "0000-0000");
		assertEquals("Novo Contato de Testes - 0000-0000\n", contato.toString());
	}
	
	// Teste de exibição Individual.
	@Test
	public void testeExibir() {
		assertEquals("Contato Para Testes - 1234-5678\n", contato.toString());
	}
	
	// Teste de exibição em Listagem.
	@Test
	public void testeListagem() {
		assertEquals("Contato Para Testes", contato.listagem());
	}
	
	// Teste de Gets.
	@Test
	public void testeGets() {
		assertEquals("Contato", contato.getNome());
		assertEquals("Para Testes", contato.getSobrenome());
		assertEquals("1234-5678", contato.getTelefone());
	}

}
