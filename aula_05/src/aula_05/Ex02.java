package aula_05;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10]; // cria um vetor de tamanho 10
        
        int soma = 0; // inicializa a soma
        double media; // armazena a media

        Scanner scanner = new Scanner(System.in); 

        // leitura dos 10 numeros inteiros
        System.out.println("Digite 10 numeros inteiros:");
        
        for (int i = 0; i < 10; i++) { // percorre os indices de 0 a 9
            System.out.print("vetor[" + i + "]: "); // pede ao usuário para inserir o número na posição i
            vetor[i] = scanner.nextInt(); // armazena o valor no vetor
            soma += vetor[i]; // adiciona o valor à soma total
        }

        // menu de opções
        String menu = """
            \nEscolha uma opcao:
            1 - Elementos nos indices impares
            2 - Elementos pares
            3 - Soma de todos os elementos
            4 - Media de todos os elementos
            5 - Vetor em ordem inversa
            6 - Sair
            """;
        
        
        int opcao;
        char continuar;
        
        do {
            System.out.print(menu); // exibe o menu
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:// exibe os elementos nos indices impares
                    System.out.println("\nElementos nos indices impares:");
                    
                    for (int i = 1; i < 10; i += 2) { // percorre apenas os indices impares
                        System.out.print(vetor[i] + " "); // imprime o elemento do indice impar
                    }
                    
                    System.out.println(); // nova linha ((organizaçao))
                    break;

                case 2:// exibe os elementos pares do vetor
                    System.out.println("\nElementos pares:");
                    
                    for (int i = 0; i < 10; i++) { // percorre todos os elementos do vetor
                        if (vetor[i] % 2 == 0) { // verifica se o elemento é par
                            System.out.print(vetor[i] + " "); // imprime o elemento par
                        }
                    }
                    System.out.println(); // nova linha após os elementos
                    break;

                case 3:// exibe a soma
                    System.out.println("\nSoma: " + soma); // mostra a soma
                    break;

                case 4:  // calcula e exibe a média
                    media = (double) soma / vetor.length; // divide a soma pela quantidade de elementos
                    
                    System.out.printf("\nMédia: %.2f\n", media); // mostra a média com duas casas decimais
                    break;

                case 5:   // exibe o vetor em ordem inversa
                    System.out.println("\nVetor em ordem inversa:");
                    
                    for (int i = 9; i >= 0; i--) { // percorre do último ao primeiro
                    	
                        System.out.print(vetor[i] + " "); // imprime o elemento
                    }
                    System.out.println(); // nova linha após os elementos
                    break;

                case 6:
                	
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
            
            
		          if (opcao != 6) {// o usuário deseja continuar?
		        	  
		            System.out.print("\nDeseja continuar? (S para sim / N para não): ");
		            continuar = scanner.next().charAt(0);
		            
		        } else {
		            continuar = 'N'; //  escolheu sair, não continua
		        }
		
		    } while (continuar == 'S' || continuar == 's'); // se o usuário escolheu continuar
		
		    scanner.close(); // fecha o scanner
    }
}