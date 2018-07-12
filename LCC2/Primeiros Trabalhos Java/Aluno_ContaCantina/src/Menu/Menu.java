package Menu;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
	private Scanner sc = new Scanner(System.in);
	
	public String opcao;
	
	while (true) {
		System.out.println(menu());
		opcao = sc.nextLine();
		
		switch (opcao) {
		case ("C"):
			cadastramento(sc, agenda);
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
	
	private static String menu() {
		return "(C)adastrar Aluno\n" + 
				"\n" + 
				"(L)ogar em Classe\n" + 
				"\n" + 
				"Opção> ";
	}
}
