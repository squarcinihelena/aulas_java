package exercicios;

import java.util.Scanner;

public class While_Ex04 {

	public static void main(String[] args) {

//		Laços Condicionais
//		Laço de Repetição WHILE

        Scanner sc = new Scanner(System.in);

        //coontadores
        int totalBackend = 0, 
        	totalMulheresFrontend = 0, 
        	totalHomensMobile = 0, 
        	totalNaoBinariosFullStack = 0;
        
        int totalPessoas = 0,
        	somaIdades = 0;

        //variável p controlar o laço de repetição 
        String cont = "S";
        
        //laço que vai continuar até o usuário digitar "n 
        while (cont.equalsIgnoreCase("S")) {

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            	System.out.print("""
            			 ────────────────────────────────────────────
            			| Identidade de Gênero:                      |
            			| 1 – Mulher Cis                             |
            			| 2 – Homem Cis                              |
            			| 3 – Não Binário                            |
            			| 4 – Mulher Trans                           |
            			| 5 – Homem Trans                            |
            			| 6 – Outros                                 |
            			 ────────────────────────────────────────────
            			Informe o número correspondente: """);
            	int identidadeGenero = sc.nextInt();
            	
            	//----------------------------------------
            	
            	System.out.print("""
            			 ────────────────────────────────────────────
            			| Pessoa Desenvolvedora:                     |
            			| 1 – Backend                                |
            			| 2 – Frontend                               |
            			| 3 – Mobile                                 |
            			| 4 – FullStack                              |
            			 ────────────────────────────────────────────
            			Informe o número correspondente: """);
            	int pessoaDesenvolvedora = sc.nextInt();

            //a cada nova pessoa
            totalPessoas++;
            //somamos a idade para dps a md
            somaIdades += idade;

            //se backend
            if (pessoaDesenvolvedora == 1) {
                totalBackend++;
            }

            //se mulher cis ou trans ,frontend, 
            if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
                totalMulheresFrontend++;
            }

            //se homem cis ou trans, mobile, > 40 anos
            if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
                totalHomensMobile++;
            }

            //se for n binário, fullstack, < 30 anos
            if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
                totalNaoBinariosFullStack++;
            }

            //perguntando se o usuário deseja 
            System.out.print("Deseja continuar (S/N): ");
            cont = sc.next().toUpperCase(); // a resposta é armazenada e transformada em maiúscula
        }

        //md de idades 
        // verifica se totalPessoas é maior que 0, se sim, calcula a média, SENAO mdIdade = 0
        double mdIdade = totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;

        //exibindo os resultados
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobile);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalNaoBinariosFullStack);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        
        //imprimindo a md de idade
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", mdIdade);

        //fechando o scanner
        sc.close();
    }
}