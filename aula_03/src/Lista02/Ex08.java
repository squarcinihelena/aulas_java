package Lista02;

import java.util.Scanner;

public class Ex08 {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        // declarando as variaveis
	        float saldo = 1000.00f; // saldo inicial
	        int operacao;
	        float valor;

	        System.out.println("""
                    Digite a operação:
                    1 - Consultar saldo
                    2 - Saque
                    3 - Depósito
                    """);


	        operacao = sc.nextInt();

	        switch (operacao) {
	            case 1:
	                System.out.printf("\nOperação - Saldo\nSaldo: R$ %.2f\n", saldo);
	                break;

	            case 2:
	                System.out.print("Valor: R$ ");
	                valor = sc.nextFloat();

	                System.out.println("\nOperação - Saque");

	                //op de atribuição
	                if (valor <= saldo) {
	                    saldo -= valor;
	                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
	                    
	                } else {
	                    System.out.println("Saldo insuficiente!");
	                }
	                break;

	            case 3:
	                System.out.print("Valor: R$ ");
	                valor = sc.nextFloat();

	                System.out.println("\nOperação - Depósito");

	                saldo += valor;
	                System.out.printf("Novo saldo: R$ %.2f\n", saldo);
	                break;

	            default:
	                System.out.println("\nOperação inválida!");
	        }

	        sc.close();
	    }
	}
