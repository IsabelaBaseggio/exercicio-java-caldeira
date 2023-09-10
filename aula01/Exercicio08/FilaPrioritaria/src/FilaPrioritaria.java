import java.util.Scanner;

public class FilaPrioritaria {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Opções para a fila\n" +
                    "1 - Gestante \n" +
                    "2 - Idoso \n" +
                    "3 - PCD \n" +
                    "4 - Nenhuma das alternativas");
        System.out.print("Selecione uma opção: ");
        int opcaoEscolhida = scan.nextInt();

        if(opcaoEscolhida < 1 || opcaoEscolhida > 4){
            while (opcaoEscolhida < 1 || opcaoEscolhida > 4){
                System.out.println("Opção inválida. Por favor, selecione novamente.");
                System.out.println("1 - Gestante \n" +
                        "2 - Idoso \n" +
                        "3 - PCD \n" +
                        "4 - Nenhuma das alternativas");
                System.out.print("Selecione uma opção: ");
                opcaoEscolhida = scan.nextInt();
            }
        }

        if(opcaoEscolhida != 4){
            System.out.println("Você tem direito à fila prioritária.");
        } else {
            System.out.println("Você não tem direito à fila prioritária");
        }
    }
}