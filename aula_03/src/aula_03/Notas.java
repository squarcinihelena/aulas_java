package aula_03;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		float nota = sc.nextFloat();
		
		if (nota >= 7) {
			System.out.println("Aluno aprovado!");
			
		}else if (nota >= 5.0 && nota < 7.0) {
			System.out.println("Exame!");
			
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		sc.close();

	}

}
