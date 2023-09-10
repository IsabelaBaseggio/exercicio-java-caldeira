import java.util.Scanner;

public class ConversorDolarParaEuroOuReal {
    public static void main(String[] args) {
        System.out.println("Converter Dolar para Euro ou Real");
        Scanner scan = new Scanner(System.in);

        System.out.print("Dolar: $");
        double dolar = scan.nextDouble();

        if(dolar < 0) {
            while (dolar < 0) {
                System.out.println("Valor inválido. Por favor, tente novamente.");
                System.out.print("Dolar: $");
                dolar = scan.nextDouble();
            }
        }

        System.out.print("Moedas \n" +
                        "1 - Euro\n" +
                        "2 - Real\n" +
                        "Selecione: ");
        int opcaoMoeda = scan.nextInt();

        if(opcaoMoeda < 1 || opcaoMoeda > 2){
            while (opcaoMoeda < 1 || opcaoMoeda > 2) {
                System.out.println("Opção inválida. Por favor, tente novamente.");
                System.out.print("Moedas \n" +
                                "1 - Euro\n" +
                                "2 - Real\n" +
                                "Selecione: ");
                opcaoMoeda = scan.nextInt();
            }
        }

        System.out.print("Digite o câmbio atual: ");
        double cambioAtual = scan.nextDouble();

        double moedaConvertida = dolar / cambioAtual;

        if(opcaoMoeda == 1){
            System.out.println("$" + dolar + " são €" + String.format("%,.2f", moedaConvertida));
        } else {
            System.out.println("$ " + dolar + " são R$" + String.format("%,.2f", moedaConvertida));
        }
    }
}