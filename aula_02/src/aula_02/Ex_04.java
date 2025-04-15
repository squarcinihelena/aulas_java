package aula_02;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		//variaveis 
		float n1, n2, n3, n4, diferenca;

		//instancia scanner
		Scanner sc = new Scanner(System.in);
		
		
		//input
		System.out.print("numero 1: ");
		n1 = sc.nextFloat();

		System.out.print("numero 2: ");
		n2 = sc.nextFloat();

		System.out.print("numero 3: ");
		n3 = sc.nextFloat();

		System.out.print("numero 4: ");
		n4 = sc.nextFloat();

		//calculo diferença
		diferenca = (n1 * n2) - (n3 * n4);

		//saida
		System.out.printf("\nDiferença: %.1f%n", diferenca);

		//fechando scanner
		sc.close();
	}
}