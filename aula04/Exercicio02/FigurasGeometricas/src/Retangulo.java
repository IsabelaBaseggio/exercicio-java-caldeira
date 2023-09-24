public class Retangulo extends FormaGeometrica {
    private double ladoLargura;
    private double ladoCumprimento;

    public Retangulo(double ladoLargura, double ladoCumprimento){
        if (ladoLargura > 0 && ladoCumprimento > 0) {
            this.ladoLargura = ladoLargura;
            this.ladoCumprimento = ladoCumprimento;
            super.tipo = "Retângulo";
        } else {
            System.out.println("Os valores informados devem ser positivos.");
        }
    }


    @Override
    protected double calcularArea() {
        if (this.ladoCumprimento > 0 && this.ladoLargura > 0){
            return ladoLargura * ladoCumprimento;
        }
        return 0;
    }
}
