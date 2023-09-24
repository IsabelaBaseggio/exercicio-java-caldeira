public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC", "ZYW", 1234);

        Veiculo moto = new Moto("DEF", "XVU", 5678);

        // Teste carro
        System.out.println(carro.getMarca());

        System.out.println(carro.getModelo());

        System.out.println(carro.getAno());

        System.out.println(carro.calcularCustoViagem(10));

        System.out.println(carro.calcularCustoViagem(-1));

        // Teste moto
        System.out.println(moto.getMarca());

        System.out.println(moto.getModelo());

        System.out.println(moto.getAno());

        System.out.println(moto.calcularCustoViagem(20));

        System.out.println(moto.calcularCustoViagem(-1));

    }
}