public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
            super.tipo = "Triângulo";
        } else {
            System.out.println("Os valores informados devem ser positivos.");
        }
    }

    @Override
    protected double calcularArea() {
        if (this.base > 0 && this.altura > 0) {
            return (this.base * this.altura) / 2;
        }
        return 0;
    }
}
