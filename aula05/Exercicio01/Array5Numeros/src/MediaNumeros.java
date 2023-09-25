import java.lang.reflect.Array;
import java.util.Scanner;

public class MediaNumeros {

    private int[] numerosInteiros = new int[5];
    private double mediaNumeros = 0;
    private Scanner scan = new Scanner(System.in);

    public MediaNumeros(){}

    public void iserirNumeros(){
        System.out.println("Digite 5 números inteiros");
        for (int i = 0; i < 5; i++){
            System.out.print(i+1 + "º número: ");
            numerosInteiros[i] = scan.nextInt();
        }
    }

    public String calcularMedia() {
        for (int numerosInteiro : numerosInteiros) {
            mediaNumeros += numerosInteiro;
        }

        mediaNumeros /= numerosInteiros.length;

        return "A média é: " + mediaNumeros;
    }
}
