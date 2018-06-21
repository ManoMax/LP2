package classes;

import java.util.Scanner;

/**
  * Representação de um Menu de Agenda.
  * Com funções de Cadastrar, Listar e Exibir contatos, mais a opção sair.
  *
  * @author Gabriel Max
  */
public class MainMenu {
	
	/**
	  * Agenda, com limíte de 100 Contatos na lista de Contatos.
	  */
	private static Agenda agenda = new Agenda();
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String opcao;
		
		while (true) {
			System.out.println(menu());
			opcao = sc.nextLine();
			
			switch (opcao) {
			case ("C"):
				cadastramento(sc, agenda);
				break;
			
			case ("A"):
				acrescentar(sc);
				break;
				
			case ("E"):
				System.out.println(exibicao(sc));
				break;
				
			case ("L"):
				System.out.println(listagem());
				break;
				
			case ("S"):
				System.exit(0);
				break;
			
			default:
				System.out.println("\nOPÇÃO INVÁLIDA!\n");
				break;
			}
		}
	}
	
	/**
	  * Lista todos os Contatos cadastrados, apresentando posição, nome e sobrenome.
	  * No formato:
	  * “Posição - Nome Sobrenome”.
	  *
	  * @returns a representação em String dos Contatos Cadastrados.
	  */
	private static String listagem() {
		return agenda.listagem();
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
	private static String exibicao(Scanner sc) {
		int pos = sc.nextInt();
		sc.nextLine();
		if (pos < 1 || pos > 100) {
			System.out.println("POSIÇÃO INVÁLIDA!");
			return "";
		} else {
		return agenda.exibirContato(pos);
		}
	}
	
	/**
	  * Exibe o Cadastro de novos 3 números, sendo eles Celular, Trabalho e Casa.
	  * No formato:
	  * "DDDCodigoDoPaisNumero".
	  *
	  * @returns a representação em String de um Contato Cadastrado.
	  */
	private static void acrescentar(Scanner sc) {
		System.out.println("\nSelecione o Contato" +
						   "\n");
		System.out.println(agenda.listagem() + "\n"+
						   "Opção> ");
		int pos = sc.nextInt();
		sc.nextLine();
		
		System.out.println("(1) Celular\n" +
						   "\n" +
						   "(2) Trabalho\n" +
						   "\n" +
						   "(3) Casa\n" + 
						   "\n" +
						   "Opção> ");
		
		int tipo = sc.nextInt();
		sc.nextLine();
		System.out.println("DDD: ");
		String ddd = sc.nextLine();
		
		System.out.println("Número: ");
		String numero = sc.nextLine();
		
		System.out.println("Código do País: ");
		String codigo = sc.nextLine();
		agenda.cadastraTelefone(tipo, ddd, numero, codigo, pos);
		
		System.out.println("\nCADASTRO REALIZADO!\n");
	}
	
	/**
	  * Cadastra um novo Contato com uma posição de 1 a 100.
	  * Caso selecionado uma posição invalida, retorna:
	  * "POSIÇÃO INVÁLIDA!"
	  * 
	  * Caso a posição seja válida, registra o nome, sobrenome e telefone do Contato.
	  *
	  * @returns void.
	  */
	private static void cadastramento(Scanner sc, Agenda agenda) {
		System.out.println("Posição: ");
		int pos = sc.nextInt();
		if (pos < 1 || pos > 100) {
			System.out.println("POSIÇÃO INVÁLIDA!\n");
			sc.nextLine();
		} else {
		
		System.out.println("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		nomeNulo(nome);
		rangeCheck(nome);
		
		System.out.println("Sobrenome: ");
		String sobre = sc.nextLine();
		
		System.out.println("Telefone: ");
		String tel = sc.nextLine();
		telefoneNulo(tel);
		
		agenda.cadastraContato(pos, nome, sobre, tel);
		System.out.println("CADASTRO REALIZADO!\n");
		}
	}
	
	/**
	  * Menu Principal do Programa.
	  * Exibe as 5 Opções Válidas.
	  * 
	  * @returns representação String do Menu.
	  */
	private static String menu() {
		return "(C)adastrar Contato\n" + 
				"\n" + 
				"(A)crescentar Número\n" +
				"\n" +
				"(L)istar Contatos\n" + 
				"\n" + 
				"(E)xibir Contato\n" + 
				"\n" + 
				"(S)air\n" + 
				"\n" + 
				"Opção> ";
	}
	
	/**
	  * Null Exception.
	  * Retorna o aviso "Nome Obrigatório!" caso o usuário forneça
	  * uma entrada vazia para Nome.
	  */
	private static void nomeNulo(String nome){
		if(nome.equals("")){
			throw new NullPointerException("Nome Obrigatório!");
		}
	}
	
	/**
	  * Null Exception.
	  * Retorna o aviso "Telefone Obrigatório!" caso o usuário forneça
	  * uma entrada vazia para Telefone.
	  */
	private static void telefoneNulo(String tel){
		if(tel.equals("")){
			throw new NullPointerException("Telefone Obrigatório!");
		}
	}
	
	/**
	  * Null Exception.
	  * Retorna o aviso "Nome Invalido!" caso o usuário forneça
	  * uma entrada Invalida para Nome.
	  */
	private static void rangeCheck(String nome) {
		boolean erro = true;
		for (int i = 0; i < nome.length(); i++) {
			if (nome.charAt(i) != ' ') {
				erro = false;
			}
		}
		if (erro) {
		throw new NullPointerException("Nome Invalido!");
	}
	}
}