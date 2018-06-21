/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class Media8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p1 = sc.nextFloat();
		float p2 = sc.nextFloat();
		float media = (p1 + p2) / 2;
	
	/*
	 *  Nesse caso abaixo, não utilizei chave, poís só existia Uma linha
	 * de comando.
	 *  É ideal que tenha chaves antes e depois.
	 * */
		
		if (media >= 7) 
			System.out.println("pass: True!");
		else
			System.out.println("pass: False!");
	}
}
