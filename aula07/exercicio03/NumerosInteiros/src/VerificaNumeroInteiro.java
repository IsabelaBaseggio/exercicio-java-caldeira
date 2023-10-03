import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificaNumeroInteiro {

    private int primeiroNumero;
    private int segundoNumero;

    public VerificaNumeroInteiro(){}

    public void verificarNumeros(){
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Digite o primeiro número: ");
            primeiroNumero = scan.nextInt();
            System.out.print("Digite o segundo número: ");
            segundoNumero = scan.nextInt();
        } catch (InputMismatchException exception){
            System.out.println("O valor digitado precisa ser inteiro.");
        }

        scan.close();

    }
}
