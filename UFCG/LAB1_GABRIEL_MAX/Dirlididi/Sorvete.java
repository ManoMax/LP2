/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Gabriel Max Vieira Matos - 117110060
 */

import java.util.Scanner;

public class Sorvete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos1 = sc.nextInt();
		int vel1 = sc.nextInt();
		int pos2 = sc.nextInt();
		int vel2 = sc.nextInt();
		int temp = sc.nextInt();
		int dist1 = (vel1 * temp) + pos1;
		int dist2 = (vel2 * temp) + pos2;
		int total;
		if (dist2 >= dist1) {
			total = dist2 - dist1;
		} else {
			total = dist1 - dist2;
		}
		System.out.printf("%d\n", total);
	}
}
