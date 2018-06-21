/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacao = sc.nextLine();
		DescobreOperacao(operacao);
	}
	
	public static void DescobreOperacao(String operacao) {
		Scanner sc = new Scanner(System.in);
		float n1 ,n2;
		if (operacao.equals("+")) {
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			float soma = n1 + n2;
			System.out.printf("RESULTADO: %.1f\n", soma);

		}else if (operacao.equals("-")) {
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			float sub = n1 - n2;
			System.out.printf("RESULTADO: %.1f\n", sub);

		}else if (operacao.equals("*")) {
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			float mult = n1 * n2;
			System.out.printf("RESULTADO: %.1f\n", mult);

		}else if (operacao.equals("/")) {
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			if (n2 == 0) {
				System.out.printf("ERRO\n");

			}else {
				float division = n1 / n2;
				System.out.printf("RESULTADO: %.1f\n", division);
			}

		}else {
			System.out.println("ENTRADA INVALIDA");
		}
	}
}
