public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        if (lado > 0) {
            this.lado = lado;
            super.tipo = "Quadrado";
        } else {
            System.out.println("O valor informado deve ser positivo.");
        }
    }

    @Override
    protected double calcularArea() {
        if (this.lado > 0){
            return Math.pow(this.lado, 2);
        }
        return 0;
    }
}
