package aula_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	 public static void main(String[] args) {

	        // criando o scanner pra ler as cores
	        Scanner sc = new Scanner(System.in);

	        // criando a lista pra armazenar as cores
	        ArrayList<String> cores = new ArrayList<String>();

	        // pedindo pro usuário digitar 5 cores
	        System.out.println("digite 5 cores:");

	        for (int i = 0; i < 5; i++) {
	            // pedindo pra digitar uma cor
	            System.out.print("cor " + (i + 1) + ": ");
	            String cor = sc.nextLine();
	            // colocando a cor na lista
	            cores.add(cor);
	        }

	        // mostrando as cores do jeito q o usuário digitou
	        System.out.println("\nlistar todas as cores:");
	        for (String cor : cores) {
	            // mostrando a cor
	            System.out.println(cor);
	        }

	        // ordenando as cores 
	        Collections.sort(cores);

	        // mostrando as cores ordenadas
	        System.out.println("\nordenar as cores:");
	        for (String cor : cores) {
	            // mostrando as cores já ordenadas
	            System.out.println(cor);
	        }

	        // fechando o scanner
	       sc.close();
	    }
	}