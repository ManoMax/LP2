/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class MaiorMenorPalavra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra1 = sc.nextLine();
		String palavra2 = sc.nextLine();
		if (palavra1.length() > palavra2.length()) {
			String aux = palavra1;
			palavra1 = palavra2;
			palavra2 = aux;
		}
		else if (palavra1.length() == palavra2.length()) {
			palavra2 = palavra1;
		}
		System.out.println(palavra1 + "\n" + palavra2);
	}
}
