import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CalculaIdadeAnoNascimento {
    public static void main(String[] args) {
        int idade;

        Calendar calendario = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int anoAtual = calendario.get(Calendar.YEAR);

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento: ");
        int anoDeNacimento = scan.nextInt();

        if (anoDeNacimento < 0 || anoDeNacimento > anoAtual){
            while (anoDeNacimento < 0 || anoDeNacimento > anoAtual) {
                System.out.println("Ano inválido. Por favor, digite novamente.");
                System.out.print("Ano de nascimento: ");
                anoDeNacimento = scan.nextInt();
            }
        }

        idade = anoAtual - anoDeNacimento;

        System.out.println("A sua idade é " + idade);
    }
}