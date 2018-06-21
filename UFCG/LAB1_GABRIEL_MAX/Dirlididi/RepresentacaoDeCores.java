/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class RepresentacaoDeCores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 < 128 || n2 < 128 || n3 < 128) {
			System.out.println("PRETO");
		} else {
			System.out.println("BRANCO");
		}
	}
}
