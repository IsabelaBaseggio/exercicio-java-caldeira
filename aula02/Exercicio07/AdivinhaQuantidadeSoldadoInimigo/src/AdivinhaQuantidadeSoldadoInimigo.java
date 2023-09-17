import java.util.Scanner;

public class AdivinhaQuantidadeSoldadoInimigo {
    public static void main(String[] args) {
        System.out.println("Adivinhe a quantidade de soldados Inimigos");

        Scanner scan = new Scanner(System.in);

        int enemySoldiers = 30000;

        int soldierAnswer;



        do {
            System.out.print("Digite um número: ");
            soldierAnswer = scan.nextInt();

            if (soldierAnswer > enemySoldiers) {
                System.out.println("Leonidas: Um pouco menos!");
            }

            if (soldierAnswer < enemySoldiers) {
                System.out.println("Leonidas: Um pouco mais!");
            }
        } while (soldierAnswer != enemySoldiers);

        scan.close();
    }
}