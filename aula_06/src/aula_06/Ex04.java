package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

        // criando o scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // criando o Set com 10 números inteiros
        Set<Integer> nums = new HashSet<>();
        
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

        // exibindo a lista de números no set
        System.out.println("Lista de números no Set:");
        nums.forEach(num -> System.out.println(num)); // lambda p imprimir cada número do Set

        // pedindo pro usuario digitar um número para busca
        System.out.print("\nQual número você deseja encontrar? ");
        int n = sc.nextInt();

        // verificando se o num está no set
        if (nums.contains(n)) {
            // se for encontrado
            System.out.println("O número " + n + " foi encontrado!");
        } else {
            // se nao for encontrado
            System.out.println("O número " + n + " não foi encontrado!");
        }

        // fechando o scanner
        sc.close();
    }
}