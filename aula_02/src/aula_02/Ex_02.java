package aula_02;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		//variaveis tipo float
		float nota01, nota02, nota03, nota04, mediaFinal;
		
		//instancia scanner
		Scanner sc = new Scanner(System.in);
	

		//input 
		System.out.print("Nota 1: ");
        nota01 = sc.nextFloat();

        System.out.print("Nota 2: ");
        nota02 = sc.nextFloat();

        System.out.print("Nota 3: ");
        nota03 = sc.nextFloat();

        System.out.print("Nota 4: ");
        nota04 = sc.nextFloat();
        
		
		//calculo da media
        mediaFinal = (nota01 + nota02 + nota03 + nota04) / 4;
        
        //output 1 casa decimal 
        System.out.printf("\nMédia final: %.1f%n", mediaFinal);
        
        //fechando sc
        sc.close();
		
	}

}
