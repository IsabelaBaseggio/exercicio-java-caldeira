import java.util.Scanner;

public class Imprime2Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primero número: ");
        int primeiroNumero = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scan.nextInt();

        System.out.println("Os número digitados foram " + primeiroNumero + " e " + segundoNumero);
    }
}