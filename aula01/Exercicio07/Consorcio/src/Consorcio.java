import java.util.Scanner;

public class Consorcio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        if(idade < 0){
            while (idade < 0){
                System.out.println("Idade inválida. Por favor, tente novamente.");
                System.out.print("Digite a sua idade: ");
                idade = scan.nextInt();
            }
        }

        System.out.print("Digite o seu salário: R$");
        double salario = scan.nextDouble();

        if (salario < 0){
            while (salario < 0){
                System.out.println("Valor inválido. Por favor, tente novamente.");
                System.out.print("Digite o seu salário: R$");
                salario = scan.nextDouble();
            }
        }

        if (idade >= 18 && salario > 2000) {
            System.out.println("O seu consório foi aprovado.");
        } else {
            System.out.println("O seu consório não foi aprovado.");
        }
    }
}