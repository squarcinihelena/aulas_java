package exercicios;

import java.util.Scanner;

public class DoWhile_Ex06 {

		public static void main(String[] args) {

//		Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o
//		número zero seja digitado. Ao final, mostre na tela a média de todos os números
//		digitados, que sejam múltiplos de 3. 
			
			Scanner sc = new Scanner(System.in);

	        int num;
	        int soma = 0;
	        int cont = 0;

	        //menu com text block 
	        System.out.print("""
	                 ─────────────────────────────────────────────────────────
	                |               CALCULADORA DE MÚLTIPLOS DE 3             |
	                |---------------------------------------------------------|
	                | Digite números inteiros.                                |
	                | O programa terminará quando você digitar o número 0.    |
	                 ─────────────────────────────────────────────────────────
	                """);

	        do {//faça
	            System.out.print("Digite um número: ");//escrevo
	            num = sc.nextInt();//le e armazena na variavel num

	            
	            if (num != 0 && num % 3 == 0) { //se numero for diferente q 0 e multiplo de 3
	                soma += num; //soma = soma + num
	                cont++; //adiciona
	            }

	        } while (num != 0); //enquanto condiçao: numero for diferente de 0

	        //se cont
	        double media = cont > 0 ? (double) soma / cont : 0; //if else ternario

	        //resultado printado
	        System.out.printf("Média dos múltiplos de 3: %-18.2f \n", media);

	        sc.close();
	    }
}
