package aula_03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String moeda = "";
		double valorConvertido = 0.0;
		
		
		System.out.println("**********************************************");
		System.out.println("           Conversor de Moedas                ");
		System.out.println("**********************************************");
		System.out.println("                                              ");
		System.out.println("1 - Converter para Dolar                      ");
		System.out.println("2 - Converter para Euro                       ");
		System.out.println("3 - Converter para Peso Argentino             ");
		
		
		int opcao = sc.nextInt();
		
		System.out.println("Digite o valor em reais (R$)");
		double valor = sc.nextDouble();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dolar";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			break;
			
		default:
			System.out.println("Opçao Invalida"); 
			sc.close();
			return;
		
		}
		
		System.out.printf("Valor convertido em %s: %.2f", moeda, valorConvertido);
		
		sc.close();
	
		
	}

}
