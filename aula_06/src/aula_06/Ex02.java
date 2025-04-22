package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	 public static void main(String[] args) {

	        // criando o scanner para ler a entrada do usuário
	        Scanner sc = new Scanner(System.in);

	        // criando a lista ArrayList com 10 números inteiros
	        ArrayList<Integer> nums = new ArrayList<>();
	        
	        nums.add(2);
	        nums.add(5);
	        nums.add(1);
	        nums.add(3);
	        nums.add(4);
	        nums.add(9);
	        nums.add(7);
	        nums.add(8);
	        nums.add(10);
	        nums.add(6);

	        // exibindo a lista
	        System.out.println("Lista de números:");
	        nums.forEach(num -> System.out.println("Número: " + num)); // lambda para exibir cada número

	        System.out.print("\nDigite o número que você deseja encontrar: ");
	        int n = sc.nextInt();

	        // verificando se o número está na lista e mostrando a posição
	        if (nums.contains(n)) {
	            int idx = nums.indexOf(n);
	            System.out.println("O número " + n + " está localizado na posição: " + idx);
	            
	        } else {
	            System.out.println("O número " + n + " não foi encontrado!");
	        }

	        // fechando o scanner
	        sc.close();
	    }
	}