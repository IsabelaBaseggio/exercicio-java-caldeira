import java.util.Random;

public class NumerosAleatorios {
    private int[] numerosAleatorios = new int[10];

    Random random = new Random();

    public NumerosAleatorios(){
        for (int i = 0; i < 10; i++){
            numerosAleatorios[i] = random.nextInt(100);
        }
    }

    public String procurarNumero(int numero){
        for (int numeroAleatorio: numerosAleatorios) {
            System.out.println(numeroAleatorio);
            if (numeroAleatorio == numero) {
                return "A lista contém o número " + numero;
            }
        }
        return "A lista não contém o número " + numero;
    }
}
