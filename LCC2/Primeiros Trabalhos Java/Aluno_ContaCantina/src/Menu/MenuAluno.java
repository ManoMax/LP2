package Menu;

import java.util.Scanner;

import classes.Aluno;

public class MenuAluno {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		Aluno aluno = new Aluno(nome);
		
		
		System.out.println("Curso: ");
		String curso = sc.nextLine();
		aluno.cadastraCurso(curso);
		
		System.out.println("Periodo(Bimestre/Semetre): ");
		String periodo = sc.nextLine();
		aluno.cadastraPeriodo(periodo);
		
		System.out.println("Periodo(Bimestre/Semetre): ");
		String periodo = sc.nextLine();
		aluno.cadastraPeriodo(periodo);
		
	}
	
	private static String menu() {
		return "(C)adastrar Aluno\n" + 
				"\n" + 
				"(L)ogar em Classe\n" + 
				"\n" + 
				"Opção> ";
	}
}
