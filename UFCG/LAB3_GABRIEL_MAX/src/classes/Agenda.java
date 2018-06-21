package classes;

public class Agenda {
	
	/**
	  * Lista de Contatos.
	  * Lista de Confirmação de Contato Cadastrado.
	  */
	private Contato[] contatos;
	private boolean[] cadastroEfetuado;
	
	/** 
	  * Representação de uma Agenda, onde toda Agenda possui uma Lista de Contatos inicialmente vazios.
	  * Também é presente uma Lista de booleanos,
	  * representando se o Cadastro foi efetuado na posição específica.
	  * 
	  * @author Gabriel Max
	  */
	public Agenda() {
		 contatos = new Contato[100];
		 cadastroEfetuado = new boolean[100];
		 for (int i = 0; i < 100; i++) {
			 cadastroEfetuado[i] = false;
		 }
	}
	
	/**
	  * Cadastra um novo Contato com uma posição de 1 a 100.
	  * 
	  * Registra o nome, sobrenome e telefone do Contato.
	  *	E torna tal posição de Contato "true" na Lista de Booleanos.
	  *
	  * @returns void.
	  */
	public void cadastraContato(int pos, String nome, String sobre, String tel) {
		this.contatos[pos-1] = new Contato(nome, sobre, tel);
		this.cadastroEfetuado[pos-1] = true;
	}
	
	/**
	  * Cadastra um novo Contato com uma posição de 1 a 100,
	  * Onde agora tal Contato possui 3 tipos de números, com DDD e código do País.
	  * 
	  * Registra o DDD, código do país e número em um determinado tipo de número.
	  * 
	  * @returns void.
	  */
	public void cadastraTelefone(int tipo, String ddd, String numero, String codigo, int pos) {
		this.contatos[pos-1].cadastraTelefone(tipo, ddd, numero, codigo);
	}
	
	/**
	  * Exibe o Cadastro de uma posição em especifico, apresentando seu nome, sobrenome e telefone.
	  * No formato:
	  * "Nome Sobrenome - Telefone".
	  * 
	  * Caso a posição não possua um Contato Cadastrado, retorna:
	  * "POSIÇÃO INVÁLIDA!"
	  *
	  * @returns a representação em String de um Contato Cadastrado.
	  */
	public String exibirContato(int pos) {
		if (!cadastroEfetuado[pos-1]) {
			return "POSIÇÃO INVÁLIDA!\n";
	  } else {
		  	return contatos[pos-1].toString();
	  }
	}
	
	/**
	  * Lista todos os Contatos cadastrados, apresentando posição, nome e sobrenome.
	  * No formato:
	  * “Posição - Nome Sobrenome”.
	  * Por Contato Cadastrado.
	  *
	  * @returns a representação em String dos Contatos Cadastrados.
	  */
	public String listagem() {
		String saida = "";
		
		for (int i = 0; i < 100; i++) {
			if (this.contatos[i] != null) {
				saida += i+1 + " - ";
				saida += contatos[i].listagem() + "\n";
			}
		}
		return saida;
	}
	
	/**
	  * Nome do Contato de uma posição específica.
	  * No formato:
	  * “Nome”.
	  * 
	  * @returns a representação em String do nome do Contato Cadastrado.
	  */
	public String getNome(int pos) {
		return contatos[pos-1].getNome();
	}
	
	/**
	  * Sobrenome do Contato de uma posição específica.
	  * No formato:
	  * “Sobrenome”.
	  * 
	  * @returns a representação em String do sobrenome do Contato Cadastrado.
	  */
	public String getSobrenome(int pos) {
		return contatos[pos-1].getSobrenome();
	}
	
	/**
	  * Telefone do Contato de uma posição específica.
	  * No formato:
	  * “Telefone”.
	  * 
	  * @returns a representação em String do telefone do Contato Cadastrado.
	  */
	public String getTelefone(int pos) {
		return contatos[pos-1].getTelefone();
	}
	
	/**
	  * Afirmação de Cadastro efetuado do Contato de uma posição específica.
	  * No formato:
	  * "true" ou "false".
	  * 
	  * @returns a representação em boolean do Contato Cadastrado.
	  */
	public boolean getCadastro(int pos) {
		return this.cadastroEfetuado[pos-1];
	}
}