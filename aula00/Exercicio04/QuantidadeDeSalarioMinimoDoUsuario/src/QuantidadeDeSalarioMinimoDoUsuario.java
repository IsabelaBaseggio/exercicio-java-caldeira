import java.util.Scanner;

public class QuantidadeDeSalarioMinimoDoUsuario {
    public static void main(String[] args) {
        double salarioMinimo = 1320.00;

        Scanner scan = new Scanner(System.in);

        System.out.println("O salário mínimo é R$" + salarioMinimo);
        System.out.print("Digite o seu salário: R$");
        double salarioUsuario = scan.nextDouble();

        double quantidadeDeSalarioMinimo = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe " + String.format("%,.2f", (salarioUsuario / salarioMinimo)) + " salário(s) mínimo(s)");
    }
}