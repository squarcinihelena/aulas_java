package aula_02;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		//declarando variaveis
		float salarioInicial, abono, novoSalario;
		
		//instanciando o scanner
		Scanner sc = new Scanner(System.in);

		
		//digite e leia
		System.out.print("Salário: ");
		salarioInicial = sc.nextFloat();
		
		System.out.print("Abono: ");
		abono = sc.nextFloat();
		
		
		//print do resultado
		novoSalario = salarioInicial + abono;
		System.out.printf("Novo salário: R$ %.2f%n", novoSalario);	
		
		
		//fechando sc mesmo sendo um mini programa 
		sc.close();
	}

}
