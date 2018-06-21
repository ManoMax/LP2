/*
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class PalavrasPoeticas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p1 = sc.nextLine();
		String p2 = sc.nextLine();
		if (p1.charAt(0) == p2.charAt(0) &&
			p1.charAt(p1.length() - 1) == p2.charAt(p2.length() - 1)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}
}
