public class Losango extends FormaGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonal1, double diagonal2) {
        if (diagonal1 > 0 && diagonal2> 0 && diagonal1 != diagonal2) {
            if (diagonal1 > diagonal2) {
                this.diagonalMaior = diagonal1;
                this.diagonalMenor = diagonal2;
            } else {
                this.diagonalMaior = diagonal2;
                this.diagonalMenor = diagonal1;
            }
            super.tipo = "Losango";
        } else {
            System.out.println("Os valores informados devem ser positivos e os valores das diagonais não podem ser iguais.");
        }
    }

    @Override
    protected double calcularArea() {
        if (this.diagonalMaior > 0 && this.diagonalMenor > 0) {
            return (diagonalMaior * diagonalMenor) / 2;
        }
        return 0;
    }
}
