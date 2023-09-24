public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        if (raio > 0) {
            this.raio = raio;
            super.tipo = "Círculo";
        } else {
            System.out.println("O valor informado deve ser positivo");
        }
    }


    @Override
    protected double calcularArea() {
        if (this.raio > 0) {
            return Math.PI * Math.pow(this.raio, 2);
        }
        return 0;
    }
}
