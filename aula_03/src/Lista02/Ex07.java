package Lista02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char continuar; // s ou n

        // do while para englobar todo o código
        do {

            // título em bloco por print
        	System.out.println("""
                            ──────────────────────────────────────────────
                                         Calculadora /ᐠ. .ᐟ\\ Ⳋ
                            ──────────────────────────────────────────────
                            """);
          
            // variáveis
            float num1, num2, resultado;
            int operacao;

            // inputs
            System.out.print("Digite o 1º número: ");
            num1 = sc.nextFloat();

            System.out.print("Digite o 2º número: ");
            num2 = sc.nextFloat();

            // menu em bloco por string
            String menu = """
                     ──────────────────────────────────────────────
                    | Escolha uma operação para continuar:         |   
                    | 1 - Soma                                     |
                    | 2 - Subtração                                |
                    | 3 - Multiplicação                            |
                    | 4 - Divisão                                  |
                     ──────────────────────────────────────────────
                    Operação: """;
            System.out.print(menu); // chama menu

            operacao = sc.nextInt();

            // switch
            switch (operacao) {

                case 1: // soma
                    resultado = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, resultado);
                    break;

                case 2: // subtração
                    resultado = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resultado);
                    break;

                case 3: // multiplicação
                    resultado = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, resultado);
                    break;

                case 4: // divisão
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, resultado);
                    } else {
                        System.out.println("Divisão por zero é impossível!");
                    }
                    break;

                default:
                    System.out.println("\nOperação inválida! Por favor, escolha uma operação válida. /ᐠ - ˕ -マ ");
            }

            // deseja continuar s/n
            System.out.print("\nDeseja realizar mais operações? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);

            System.out.println(); // linha para separar

        } while (continuar == 's');
        // fim ou recomeço do loop

        System.out.println("Você chegou ao FIM. ₊˚⊹♡ ᓚ₍ ^. .^₎");
        sc.close();
    }
}
