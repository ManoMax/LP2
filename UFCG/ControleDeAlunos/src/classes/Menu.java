package classes;

import java.util.Scanner;

/**
 * Representação de um Menu do Controle de Alunos.
 * Com funções de Cadastrar Aluno, Exibir Aluno,
 * Criar Novo Grupo, Aloca-lo nele, Registrar Efetuação de Resposta do Aluno,
 * Imprimir Alunos que responderam (Por ondem de procedência) e sair do Programa.
 *
 * @author Gabriel Max
 */
public class Menu {
	
	/**
	  * Funcionamento de Entrada de Dados.
	  * Construção do Sistema.
	  */
	private static String opcao;
	private static Scanner sc = new Scanner(System.in);
	private static Sistema sistema = new Sistema();
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.println(menu());
			opcao = sc.nextLine();
			analisaExcecao(opcao);
			
			switch (opcao) {
			
				// (C)adastrar Aluno
				case ("C"):
					cadastrarAluno();
					break;
				
				// (E)xibir Aluno
				case ("E"):
					exibirAluno();
					break;
				
				// (N)ovo Grupo
				case ("N"):
					novoGrupo();
					break;
				
				// (A)locar Aluno no Grupo e Imprimir Grupos
				case ("A"):
					alocarAluno();
					break;
				
				// (R)egistrar Resposta de Aluno
				case ("R"):
					registrarResposta();
					break;
					
				// (I)mprimir Alunos que Responderam
				case ("I"):
					imprimirAlunos();
					break;
				
				// (O)ra, vamos fechar o programa!
				case ("O"):
					System.exit(0);
					break;
			}
		
		}
		

	}
	
	/**
	  * Illegal Argument Exception.
	  * Retorna o aviso "Entrada inválida (vazia)" caso o usuário forneça
	  * uma entrada vazia.
	  */
	private static void analisaExcecao(String excecao) {
		boolean erro = true;
		for (int i = 0; i < excecao.length(); i++) {
			if (excecao.charAt(i) != ' ') {
				erro = false;
			}
		}
		if (erro) {
			throw new IllegalArgumentException("Entrada inválida (vazia)");
		}
	}

	/**
	  * Lista todos os Alunos com Respostas Registradas,
	  * apresentando posição, matricula, nome e curso.
	  * No formato:
	  * “Posição. Matricula - Nome - Curso”.
	  *
	  * @returns a representação em String dos Alunos com Respostas Registradas.
	  */
	private static void imprimirAlunos() {
		System.out.println(sistema.imprimirAlunos());
	}

	/**
	  * Caso fornecido uma entrada válida:
	  * Registra mais uma Resposta de um Aluno especifico.
	  * 
	  * Caso fornecido uma entrada inválida, é lançado:
	  * IllegalArgumentException - "Entrada inválida (vazia)"
	  * 
	  * @returns void.
	  */
	private static void registrarResposta() {
		System.out.println("Matricula: ");
		String matricula = sc.nextLine();
		analisaExcecao(matricula);
		if (sistema.registrarResposta(matricula)) {
			System.out.println("ALUNO REGISTRADO!\n");
		} else {
			System.out.println("Aluno não cadastrado.\n");
		}
	}

	/**
	  * Caso fornecido uma entrada válida:
	  * Aloca um Aluno em um grupo especifico.
	  * 
	  * Caso fornecido uma entrada inválida, é lançado:
	  * IllegalArgumentException - "Entrada inválida (vazia)",
	  * "Aluno não cadastrado." ou "Grupo não cadastrado.".
	  * 
	  * @returns void.
	  */
	private static void alocarAluno() {
		System.out.println("(A)locar Aluno ou (I)mprimir Grupo?");
		String config = sc.nextLine();
		analisaExcecao(config);
		
		switch (config) {
			case ("A"):
				System.out.println("Matricula: ");
				String matricula = sc.nextLine();
				analisaExcecao(matricula);
				
				if (!sistema.verificaAluno(matricula)) {
					System.out.println("Aluno não cadastrado.\n");
					
				} else {
					String grupo = sc.nextLine().toLowerCase();
					analisaExcecao(grupo);
					if (sistema.alocarAluno(matricula, grupo)) {
						System.out.println("ALUNO ALOCADO!\n");
						
					} else {
						System.out.println("Grupo não cadastrado.\n");
					}
				}
				break;
			
			case ("I"):
				System.out.println("Grupo: ");
				String grupo = sc.nextLine().toLowerCase();
				analisaExcecao(grupo);
				
				System.out.println(sistema.imprimirGrupo(grupo));
				break;
		}
	}

	/**
	  * Caso fornecido uma entrada válida:
	  * Cria e Registra um novo grupo no Sistema.
	  * Printado: "CADASTRO REALIZADO!"
	  * 
	  * Caso fornecido uma entrada inválida, é lançado:
	  * IllegalArgumentException - "Entrada inválida (vazia)" ou
	  * "GRUPO JÁ CADASTRADO!"
	  * 
	  * @returns void.
	  */
	private static void novoGrupo() {
		System.out.println("Grupo: ");
		String grupo = sc.nextLine().toLowerCase();
		analisaExcecao(grupo);
		
		if (sistema.novoGrupo(grupo)) {
			System.out.println("\nCADASTRADO REALIZADO!\n");
		} else {
			System.out.println("GRUPO JÁ CADASTRADO!");
		}
	}

	/**
	  * Caso fornecido uma entrada válida:
	  * Exibe o Aluno, no Formato:
	  * "Matricula - Nome - Curso"
	  * 
	  * Caso fornecido uma entrada inválida, é lançado:
	  * IllegalArgumentException - "Entrada inválida (vazia)" ou
	  * "Aluno não cadastrado."
	  * 
	  * @returns void.
	  */
	private static void exibirAluno() {
		System.out.println("Matrícula: ");
		String matricula = sc.nextLine();
		analisaExcecao(matricula);
		
		System.out.println(sistema.exibirAluno(matricula));
	}

	/**
	  * Caso fornecido uma entrada válida:
	  * Cadastra um novo Aluno.
	  * Printado: "CADASTRO REALIZADO!"
	  * 
	  * Caso fornecido uma entrada inválida, é lançado:
	  * IllegalArgumentException - "Entrada inválida (vazia)" ou
	  * "MATRÍCULA JÁ CADASTRADA!"
	  * 
	  * @returns void.
	  */
	private static void cadastrarAluno() {
		System.out.println("Matrícula: ");
		String matricula = sc.nextLine();
		analisaExcecao(matricula);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		analisaExcecao(nome);
		
		System.out.println("Curso: ");
		String curso = sc.nextLine();
		analisaExcecao(curso);
		
		if (sistema.cadastrarAluno(matricula, nome, curso)) {
			System.out.println("\nCADASTRO REALIZADO!\n");
		} else {
			System.out.println("MATRÍCULA JÁ CADASTRADA!\n");
		}
	}

	/**
	  * Menu Principal do Programa.
	  * Exibe as 7 Opções Válidas.
	  * 
	  * @returns representação String do Menu.
	  */
	private static String menu() {
		return "(C)adastrar Aluno\n" +
			"(E)xibir Aluno\n" +
			"(N)ovo Grupo\n" +
			"(A)locar Aluno no Grupo e Imprimir Grupos\n" +
			"(R)egistrar Resposta de Aluno\n" +
			"(I)mprimir Alunos que Responderam\n" +
			"(O)ra, vamos fechar o programa!\n" +
			"Opção>";
	}

}
