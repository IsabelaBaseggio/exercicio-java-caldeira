import java.lang.String;
import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        System.out.println("String Invertida");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String stringUsuario = scan.nextLine();

        String stringInvertida = "";

        for (int i = stringUsuario.length() - 1; i >= 0; i--) {
            char caractere = stringUsuario.charAt(i);
            stringInvertida += caractere;
        }

        System.out.println(stringInvertida);
    }
}