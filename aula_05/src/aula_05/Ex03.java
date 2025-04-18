package aula_05;

import java.util.Scanner;

public class Ex03 {
	
	 public static void main(String[] args) {
		 
	        int[][] matriz = new int[3][3]; // cria uma matriz 3x3 de inteiros
	        
	        int somaPrincipal = 0; // inicializa a variavel para somar a diagonal principal
	        int somaSecundaria = 0; // inicializa a variavel para somar a diagonal secundaria

	        Scanner scanner = new Scanner(System.in); 

	        // leitura dos elementos da matriz
	        System.out.println("Digite os elementos da matriz 3x3:"); 
	        
	        for (int i = 0; i < 3; i++) { // percorre as linhas da matriz
	        	
	            for (int j = 0; j < 3; j++) { // percorre as colunas da matriz
	            	
	                System.out.println("matriz[" + i + "][" + j + "]: "); // posicao atual
	                matriz[i][j] = scanner.nextInt(); // armazena na matriz
	            }
	        }

	        System.out.print("\nElementos da Diagonal Principal: "); // diagonal principal
	        for (int i = 0; i < 3; i++) { // percorre os indices
	        	
	            System.out.print(matriz[i][i] + " "); // elemento da diagonal principal
	            somaPrincipal += matriz[i][i]; // soma 
	        }

	        System.out.print("\nElementos da Diagonal Secundaria: "); // diagonal secundaria
	        for (int i = 0; i < 3; i++) { // percorre 
	        	
	            System.out.print(matriz[i][2 - i] + " "); // elemento da diagonal secundaria
	            somaSecundaria += matriz[i][2 - i]; // soma
	        }

	        System.out.println("\n\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal); 
	        System.out.println("Soma dos Elementos da Diagonal Secundaria: " + somaSecundaria);

	        scanner.close(); // fecha o scanner
	    }
	}