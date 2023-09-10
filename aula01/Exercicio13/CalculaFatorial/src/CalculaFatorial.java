import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        if (numero < 0) {
            while (numero < 0) {
                System.out.println("Número inválido. Por favor, digite um número positivo.");
                System.out.print("Número: ");
                numero = scan.nextInt();
            }
        }

        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }
    }
}