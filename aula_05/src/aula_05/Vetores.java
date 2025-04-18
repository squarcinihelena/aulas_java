package aula_05;

import java.util.Scanner;

public class Vetores {
	 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280, 320, 480};
		
		float vetorReal[] = new float[5];
		
		
		for(int indice = 0; indice < vetorInteiros.length; indice++){
		
			System.out.printf("vetorInteiros[%d]: %d\n", indice, vetorInteiros[indice]);
		}
		
		for(int indice = 0; indice < vetorReal.length; indice++)
		{
			System.out.println("\nDigite um número Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		// for each
		for(var valor : vetorReal) {  	//var coloca a variavel conforme o vetor
			
			System.out.println("Elemento atual: " + valor);
		}
	}
}
 