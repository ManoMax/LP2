/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class DobroTriplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dobro = num * 2;
		int triplo = num * 3;
		System.out.println("dobro: " + dobro + 
		", triplo: " + triplo);
	}
}
