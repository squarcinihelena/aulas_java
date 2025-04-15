package Lista01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        // input
        System.out.print("Digite o nome do doador: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do doador: ");
        int idade = sc.nextInt();

        System.out.print("Primeira doação de sangue? true/false): ");
        boolean primeiraDoacao = sc.nextBoolean();

        boolean apto = false;

        // se está apto
        if (idade >= 18 && idade <= 59) {
            apto = true;
            
            //senao
        } else if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
            apto = true;
        }

        // saida de acordo com a condição
        if (apto) {
            System.out.printf("\n%s está apto para doar sangue!\n", nome);
        } else {
            System.out.printf("\n%s não está apto para doar sangue!\n", nome);
        }

        sc.close();
    }
}