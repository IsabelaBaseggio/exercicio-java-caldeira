import java.util.Scanner;

public class VerificaIdadeParaVotar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        if (idade < 0){
            while (idade < 0){
                System.out.println("A idade não é válida.");
                System.out.print("Digite a sua idade: ");
                idade = scan.nextInt();
            }
        }

        if (idade < 16){
            System.out.println("Você não tem idade para votar");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Você tem idade para vota e seu voto é facultativo");
        } else {
            System.out.println("Você tem idade para votar e seu voto é obrigatório");
        }
    }
}