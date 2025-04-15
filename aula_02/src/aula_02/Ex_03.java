package aula_02;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		//variaveis 
		float salarioBruto, adcNoturno, horasExtras, descontos, salarioLiquido;
		
		//instancia scanner
		Scanner sc = new Scanner(System.in);
		
		
		//input 
		System.out.print("Digite o salario bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.print("Digite o adicional noturno: ");
		adcNoturno = sc.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		horasExtras = sc.nextFloat();

		System.out.print("Digite os descontos: ");
		descontos = sc.nextFloat();		
		
		
		//calculo salario liquido 
		salarioLiquido = salarioBruto + adcNoturno + (horasExtras * 5) - descontos;

		
		//output 1 casa decimal 
		System.out.printf("\nSalário líquido: R$ %.1f%n", salarioLiquido);

        //fechando sc
        sc.close();
		
	}

}
