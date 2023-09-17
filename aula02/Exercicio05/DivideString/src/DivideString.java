import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        System.out.println("Divida uma palavra ou uma frase");

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma palavra ou uma frase:");
        String stringUsuario = scan.nextLine();

        int metadeString = stringUsuario.length() / 2;

        System.out.println(stringUsuario.substring(0, metadeString));

    }
}