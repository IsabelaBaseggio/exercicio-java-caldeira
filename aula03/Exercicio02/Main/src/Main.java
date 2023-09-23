public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.5);

        double areaCirculo = circulo.calcularAreaCirculo();
        System.out.println(areaCirculo);

        double circunferenciaCirculo = circulo.calcularCircunferenciaCirculo();
        System.out.println(circunferenciaCirculo);

        double diametroCirculo = circulo.calcularDiametroCirculo();
        System.out.println(diametroCirculo);

        Circulo circulo2 = new Circulo(4.6);
        circulo.verificarSeSaoCirculosIguais(circulo2);

        String circuloString = circulo.toString();
        System.out.println(circuloString);

        double areaCirculo2 = circulo2.calcularAreaCirculo();
        System.out.println(areaCirculo2);

        double areaSombreada = circulo.calcularAreaSombreada(circulo2);
        System.out.println(areaSombreada);

        circulo.definirRaio(-4.6);

        Circulo circulo3 = new Circulo(4.5, 2, 4);

        System.out.println(circulo3.calcularAreaCirculo());

        System.out.println(circulo3.calcularCoordenadasCirculo());

    }
}