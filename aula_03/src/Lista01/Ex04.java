package Lista01;

import java.util.Scanner;

public class Ex04 {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        // declarando as variaveis e inicializando
	        String 	tipo, classe, alimentacao, animal = "";

	        // entrada e saída 
	        System.out.println("𓇼 ⋆.˚ 𓆉 𓆝 𓆡⋆.˚ 𓇼 Identificador de Animais 𓇼 ⋆.˚ 𓆉 𓆝 𓆡⋆.˚ 𓇼  ");
	        System.out.println("Digite a primeira palavra (vertebrado/invertebrado):");
	        tipo = sc.nextLine();

	        System.out.println("Digite a segunda palavra: ");
	        classe = sc.nextLine();

	        System.out.println("Digite a terceira palavra: ");
	        alimentacao = sc.nextLine();

	         // verificando combinações
	        if (tipo.equalsIgnoreCase("vertebrado")) {
	        	
	            if (classe.equalsIgnoreCase("ave")) {
	            	
	                if (alimentacao.equalsIgnoreCase("carnivoro")) {
	                    animal = "Águia";
	                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
	                    animal = "Pomba";
	                }

	            } else if (classe.equalsIgnoreCase("mamifero")) {
	            	
	                if (alimentacao.equalsIgnoreCase("onivoro")) {
	                    animal = "Homem";
	                } else if (alimentacao.equalsIgnoreCase("herbivoro")) {
	                    animal = "Vaca";
	                }
	            }

	        } else if (tipo.equalsIgnoreCase("invertebrado")) {
	        	
	            if (classe.equalsIgnoreCase("inseto")) {
	            	
	                if (alimentacao.equalsIgnoreCase("hematofago")) {
	                    animal = "Pulga";
	                } else if (alimentacao.equalsIgnoreCase("herbivoro")) {
	                    animal = "Lagarta";
	                }

	            } else if (classe.equalsIgnoreCase("anelideo")) {
	            	
	                if (alimentacao.equalsIgnoreCase("hematofago")) {
	                    animal = "Sanguessuga";
	                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
	                    animal = "Minhoca";
	                }
	            }
	        }

	        // aqui sai
	        if (animal.isEmpty()) {
	            System.out.println("\nAnimal não encontrado.");
	            
	        } else {
	            System.out.println("\nFoi identificado: " + animal);
	        }
	        
	        sc.close();
	    }
	}