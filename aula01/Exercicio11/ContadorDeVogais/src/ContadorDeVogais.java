import java.util.Scanner;
import java.lang.String;

public class ContadorDeVogais {
    public static void main(String[] args) {

        int quantidadeVogais = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        String[] palavraArray = palavra.split("");

        for (String c : palavraArray) {
            if ("a".equalsIgnoreCase(c) || "e".equalsIgnoreCase(c) || "i".equalsIgnoreCase(c) || "o".equalsIgnoreCase(c) || "u".equalsIgnoreCase(c)) {
                quantidadeVogais += 1;
            }
        }

        System.out.println("A palavra digitada tem " + quantidadeVogais + " vogais");

    }
}