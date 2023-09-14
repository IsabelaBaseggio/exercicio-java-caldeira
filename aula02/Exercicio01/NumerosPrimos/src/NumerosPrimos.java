import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Escolha um intervalo de números inteiros maior que zero");

        Scanner scan = new Scanner(System.in);

        System.out.print("Começo do intervalo: ");
        int comecoIntervalo = scan.nextInt();

        while (comecoIntervalo < 1) {
            System.out.println("Valor inválido. Por favor, tente novamente");
            System.out.print("Começo do intervalo: ");
            comecoIntervalo = scan.nextInt();
        }

        System.out.print("Fim do intervalo: ");
        int fimIntervalo = scan.nextInt();

        while (fimIntervalo < comecoIntervalo) {
            System.out.println("Valor inválido. Por favor, tente novamente");
            System.out.print("Fim do intervalo: ");
            fimIntervalo = scan.nextInt();
        }

        for (int i = comecoIntervalo; i <= fimIntervalo; i++){

            if (i == 1 || i == 2) {
                System.out.println(i);
            } else {
                boolean ePrimo = true;

                for (int j = 2; j < i; j++){
                    if (i % j == 0) {
                        ePrimo = false;
                    }

                }

                if(ePrimo) {
                    System.out.println(i);
                }

            }
        }
    }
}