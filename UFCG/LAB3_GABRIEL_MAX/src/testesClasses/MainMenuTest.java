package testesClasses;

import org.junit.Test;

import classes.Contato;

public class MainMenuTest {
	
	// Teste de Null Exception na Construção com nome Null de Contato.
	@Test(expected=NullPointerException.class)
	public void testNomeNull() {
	    Contato contatoInvalido = new Contato(null, "Gaudencio", "21010000");
	}

}
