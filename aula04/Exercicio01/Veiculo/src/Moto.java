public class Moto extends Veiculo{

    private double valorKm = 0.15;
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        if (distancia > 0) {
            return this.valorKm * distancia;
        }
        System.out.println("O valor da distância precisa ser positivo.");
        return 0;
    }
}
