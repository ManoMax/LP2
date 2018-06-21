/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class Laco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		for (String palavra : linha.split("")) {
			System.out.println("Palavra: " + palavra);
		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d\n", i);
		}
	}
}
