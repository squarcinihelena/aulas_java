package aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue<String> fila = new LinkedList<>();

		int op; // inicializa op

		do {
			System.out.println("""
					──────────────────────────────────────────────────
					          Banco - Fila de Atendimento
					─────────────────────────────────────────────────
					1 - Adicionar Cliente na Fila
					2 - Listar todos os Clientes
					3 - Retirar Cliente da Fila
					0 - Sair
					──────────────────────────────────────────────────
					""");

			System.out.println("Digite uma opção: ");
			op = sc.nextInt(); // armazena a opção aquii

			sc.skip("\\R");

			switch (op) {
				case 1: { // adicionar um cliente à fila
					
					System.out.print("\nDigite o nome: ");
					String nome = sc.nextLine();
					
					// adiciona o cliente
					fila.add(nome);
					System.out.println("Cliente Adicionado! ");

					System.out.println("Fila atual:");
					// itera sob os clientes na fila
					fila.forEach(cliente -> System.out.println("- " + cliente));
					
					break;
				}
				case 2: { // listar todos os clientes na fila
					
					if (fila.isEmpty()) {
						System.out.println("\nA Fila está vazia! ");
						
					} else {
						// se a fila não estiver vazia, exibe a lista de clientes
						System.out.println("\nLista de Clientes na Fila: ");
						
						// itera sob os clientes na fila
						fila.forEach(cliente -> System.out.println("- " + cliente));
					}
					break;
				}
				case 3: { // retirar um cliente
					
					if (fila.isEmpty()) {
						System.out.println("\nA Fila está vazia! ");
						
					} else {
						// tira o primeiro cliente da fila
						String chamado = fila.poll();
						
						// cliente foi chamado
						System.out.println("\nCliente Chamado! ");
						
						// exibe o nome do cliente
						System.out.println("\nCliente: \n" + chamado);
						
						// exibe a fila atualizada
						System.out.println("\nFila atual:");
						
						// itera sobre os clientes restantes e exibe
						fila.forEach(cliente -> System.out.println("- " + cliente));
					}
					break;
				}
				case 0: { // sai do programa
					
					System.out.println("\nFIM!");
					break;
				}
				default: {
					// caso o usuário digite uma opção inválida
					System.out.println("\nOpção inválida! ");
					break;
				}
			}

		} while (op != 0);
	}
}
