package exercicios;

import java.util.Scanner;

public class For_Ex02 {
	
//	Escreva um algoritmo em Java, que leia 10 números inteiros via 
//	teclado e mostre na tela quantos números são pares e 
//	quantos número são ímpares. 


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int[] nums = new int[10]; 
        int par = 0, 
        	impar = 0;

        //insere os 10 numeros pelo usuario 
        for (int i = 0; i < 10; i++) { //ou .lenght
        	
        	System.out.println("Posição no array: " + i);//onde está o index só pra visualizar
        	
            System.out.print("Escreva o " + (i + 1) + "° número: ");
            nums[i] = sc.nextInt(); 
        }

       //for each pra percorrer todo array pronto
        for (int num : nums) {
        	
        	//bloco for q vai verificar se os numeros sao pares ou impares
            if (num % 2 == 0) { //verifica se é par
                par++; //se for, adiciona
                
            } else {
                impar++; //adiciona impar
            }
            
        }

        System.out.println("\nQuantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);

        sc.close();
    }
}