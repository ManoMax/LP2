package testesClasses;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Agenda;

public class AgendaTest {
	
	private Agenda agenda;
	
	// Representação de uma Agenda, com Lista de Contatos inicialmente vazia.
	@Before
	public void criaAgenda() {
		agenda = new Agenda();
	}
	
	// Teste Construtor de Agenda.
	@Test
	public void construtorAgenda() {
		Agenda novaAgenda = new Agenda();
		assertEquals("POSIÇÃO INVÁLIDA!\n", novaAgenda.exibirContato(20));
		
		novaAgenda.cadastraContato(100, "Contato", "No Limite", "(83) 9.8765-4321");
		assertEquals("Contato No Limite - (83) 9.8765-4321\n", novaAgenda.exibirContato(100));
	}
	 
	// Teste de Cadastramento de Contato na Agenda.
	@Test
	public void testeCadastraContato() {
		assertEquals(false, agenda.getCadastro(20));
		agenda.cadastraContato(20, "Matheus", "", "(83) 99999-0000");
		assertEquals("Matheus", agenda.getNome(20));
		assertEquals("", agenda.getSobrenome(20));
		assertEquals("(83) 99999-0000", agenda.getTelefone(20));
		assertEquals(true, agenda.getCadastro(20));
		
		agenda.cadastraContato(20, "Pedro", "", "(84) 98888-11111");
		assertEquals("Pedro", agenda.getNome(20));
		assertEquals("", agenda.getSobrenome(20));
		assertEquals("(84) 98888-11111", agenda.getTelefone(20));
		assertEquals(true, agenda.getCadastro(20));		
	}
	

	// Teste de Exibir Contato da Agenda.
	@Test
	public void testeExibirContato() {
		assertEquals("POSIÇÃO INVÁLIDA!\n", agenda.exibirContato(20));
		agenda.cadastraContato(20, "Matheus", "", "(83) 99999-0000");
		
		assertEquals("Matheus  - (83) 99999-0000\n", agenda.exibirContato(20));
	}
	
	// Teste de Listar Contatos da Agenda.
	@Test
	public void testeListarContatos() {
		// Lista vazia:
		assertEquals("", agenda.listagem());
		
		// Lista com uma pessoa faltando informação:
		agenda.cadastraContato(20, "Matheus", "", "(83) 99999-0000");
		assertEquals("20 - Matheus \n", agenda.listagem());
		
		// Lista com um pessoa com todas as informações:
		agenda.cadastraContato(20, "Matheus", "Gaudencio", "(83) 99999-0000");
		assertEquals("20 - Matheus Gaudencio\n", agenda.listagem());
		
		// Lista com mais de uma pessoa:
		agenda.cadastraContato(44, "Posto", "Ipiranga", "0500 2018 007");
		assertEquals("20 - Matheus Gaudencio\n" +
					 "44 - Posto Ipiranga\n", agenda.listagem());
	}
	
	// Teste de Gets.
	@Test
	public void testeGets() {
		agenda.cadastraContato(55, "Arduino", "Filho", "1010-0101");
		assertEquals("Arduino", agenda.getNome(55));
		assertEquals("Filho", agenda.getSobrenome(55));
		assertEquals("1010-0101", agenda.getTelefone(55));
	}
	
	// Teste de Cadastro Efetuado.
	@Test
	public void testeCadastroEfetuado() {
		assertEquals(false, agenda.getCadastro(26));
		agenda.cadastraContato(26, "Menino", "Da Lua", "0");
		assertEquals(true, agenda.getCadastro(26));
	}
	
}