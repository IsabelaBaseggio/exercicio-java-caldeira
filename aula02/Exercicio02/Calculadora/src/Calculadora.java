import java.util.Scanner;
import java.lang.String;

public class Calculadora {
    public static void main(String[] args) {
        double resultado = 0;

        System.out.println("Calculadora básica");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scan.nextDouble();

        System.out.print("Selecione uma operação: \n" +
                "[1] + soma \n" +
                "[2] - subtração \n" +
                "[3] * multiplicação \n" +
                "[4] / divisão \n" +
                "[n] se deseja encerrar \n" +
                "Opção: ");
        String opcao = scan.next().toLowerCase();

            switch (opcao) {
                case "1":
                    resultado = primeiroNumero + segundoNumero;
                    System.out.println("O resulta de " + primeiroNumero + " + " + segundoNumero + " é " + resultado);
                    break;
                case "2":
                    resultado = primeiroNumero - segundoNumero;
                    System.out.println("O resulta de " + primeiroNumero + " - " + segundoNumero + " é " + resultado);
                    break;
                case "3":
                    resultado = primeiroNumero * segundoNumero;
                    System.out.println("O resulta de " + primeiroNumero + " * " + segundoNumero + " é " + resultado);
                    break;
                case "4":
                    if(segundoNumero != 0) {
                        resultado = primeiroNumero / segundoNumero;
                        System.out.println("O resulta de " + primeiroNumero + " / " + segundoNumero + " é " + resultado);
                    } else {
                        System.out.println("Ops! Nenhum número pode ser dividido por zero");
                    }
                    break;
                case "n":
                    System.out.println("Operação cancelada");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        scan.close();

    }
}