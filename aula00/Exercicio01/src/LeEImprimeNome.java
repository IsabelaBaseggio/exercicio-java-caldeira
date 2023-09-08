import java.util.Scanner;

public class LeEImprimeNome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Bem-vindo(a) " + nome + "!");


    }
}