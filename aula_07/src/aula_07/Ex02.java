package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();
        int op;

        do {
            System.out.println(""" 
                    ────────────────────༺𓆩༒︎𓆪༻───────────────────────────
                                      Biblioteca
                    ────────────────────༺𓆩༒︎𓆪༻───────────────────────────
                    1 - Adicionar um novo livro na pilha
                    2 - Listar todos os livros da pilha
                    3 - Retirar um livro da pilha
                    0 - Sair
                    ────────────────────༺𓆩༒︎𓆪༻───────────────────────────
                    """);

            System.out.print("Digite uma opção: ");
            op = sc.nextInt();
            sc.skip("\\R"); //tira o errinho do next

            switch (op) {
                case 1: { //adicionar um livro na pilha

                    System.out.print("\nDigite o nome do livro: ");
                    String livro = sc.nextLine();
                    pilha.push(livro); // Adiciona o livro no topo da pilha

                    //exibe a pilha atualizada
                    System.out.println("\nPilha:");
                    pilha.forEach(elemento -> System.out.println(elemento));
                    System.out.println("\nLivro adicionado!");
                    break;
                }
                case 2: { //listar todos os livros na pilha

                    if (!verificarPilhaVazia(pilha)) {
                    	
                        System.out.println("\nLista de livros na pilha:");
                        pilha.forEach(elemento -> System.out.println(elemento));
                    }
                    break;
                }
                case 3: { //retirar um livro da pilha

                    if (!verificarPilhaVazia(pilha)) {
                    	
                        String livroRemovido = pilha.pop();
                        System.out.println("\nPilha:");
                        pilha.forEach(elemento -> System.out.println(elemento));
                        System.out.println("\nO livro foi retirado da pilha!");
                        System.out.println("Livro retirado: " + livroRemovido);
                    }
                    break;
                }
                case 0: { // finalizar o programa
                    System.out.println("\nFIM!");
                    break;
                }
                default: { // opção inválida
                    System.out.println("\nOpção inválida!");
                    break;
                }
            }

        } while (op != 0); // o programa continua até que a opção 0 seja selecionada
        
    }

		    // metodo q verifica se a pilha está vazia
		    public static boolean verificarPilhaVazia(Stack<String> pilha) {
		        if (pilha.isEmpty()) {
		            System.out.println("\nA pilha está vazia!");
		            return true;
		        }
		        return false;
    }
}