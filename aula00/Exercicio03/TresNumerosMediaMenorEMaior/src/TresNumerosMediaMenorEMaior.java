import java.util.Scanner;

public class TresNumerosMediaMenorEMaior {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[3];
        double media = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scan.nextInt();

            media += numeros[i];
        }

        int maiorNumero = Math.max(Math.max(numeros[0], numeros[1]), numeros[2]);
        int menorNumero = Math.min(Math.min(numeros[0], numeros[1]), numeros[2]);
        media = media / 2;

        System.out.println("O menor número digitado foi " + menorNumero + ", o maior número digitado foi " + maiorNumero + " e a média dos números digitados é " + media);

    }
}