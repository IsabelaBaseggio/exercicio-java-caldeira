public class Circulo {

    private double raio;
    private double coordenadaX;
    private double coordenaday;

    public Circulo(double raio) {
        if (this.raioEPositivo(raio)) {
            this.raio = raio;
        } else {
            System.out.println("O valor informado precisa ser positivo.");
        }
    }

    public Circulo(double raio, double coordenadaX, double coordenaday) {
        if (this.raioEPositivo(raio)) {
            this.raio = raio;
            this.coordenadaX = coordenadaX;
            this.coordenaday = coordenaday;
        } else {
            System.out.println("O valor do raio precisa ser positivo.");
        }
    }

    private boolean raioEPositivo (double raio) {
        return raio > 0;
    }

    public double calcularAreaCirculo() {
        if (this.raioEPositivo(this.raio)) {
            return Math.PI * Math.pow(this.raio, 2);
        }
        return 0;
    }

    public double calcularCircunferenciaCirculo() {
        if (this.raioEPositivo(this.raio)) {
            return Math.PI * (this.raio * 2);
        }
        return 0;
    }

    public double calcularDiametroCirculo() {
        if (this.raioEPositivo(this.raio)) {
            return 2 * this.raio;
        }
        return 0;
    }

    public void definirRaio(double novoRaio) {
        if (this.raioEPositivo(novoRaio)) {
            this.raio = novoRaio;
        } else {
            System.out.println("O valor informado precisa ser positivo.");
        }
    }

    public String toString() {
        if (this.raioEPositivo(this.raio)) {
            return "Raio: " + String.format("%,.4f", this.raio) + ". - Área: " + String.format("%,.4f", this.calcularAreaCirculo()) + ". - Circunferencia: " + String.format("%,.4f", this.calcularCircunferenciaCirculo()) + ".";
        }
        return "Erro ao executar método.";
    }

    public void verificarSeSaoCirculosIguais(Circulo circulo){
        if (this.raioEPositivo(this.raio) && this.raioEPositivo(circulo.raio)) {
            if (this.raio == circulo.raio) {
                System.out.println("Os círculos são iguais.");
            } else {
                System.out.println("Os círculos não são iguais.");
            }
        } else {
            System.out.println("Erro ao executar método.");
        }
    }

    public double calcularAreaSombreada(Circulo circulo) {
        if (this.raioEPositivo(this.raio) && this.raioEPositivo(circulo.raio)) {
            if (this.raio != circulo.raio) {
                if (this.raio > circulo.raio) {
                    return this.calcularAreaCirculo() - circulo.calcularAreaCirculo();
                }
                return circulo.calcularAreaCirculo() - this.calcularAreaCirculo();
            } else {
                System.out.println("Os círculo possuem raios iguais, portanto, não há área sombreada.");
                return 0;
            }
        }
        System.out.println("Erro ao executar método.");
        return 0;
    }

    public String calcularCoordenadasCirculo(){
        if(this.raioEPositivo(this.raio)){
            double xMinimo = coordenadaX - this.raio;
            double xMaximo = coordenadaX + this.raio;
            double yMinimo = coordenaday - this.raio;
            double yMaximo = coordenaday + this.raio;

            return "As coordenadas mínimas e máximas do círculo no plano cartesiano são " + String.format("%,.2f", xMinimo) + " e " + String.format("%,.2f", xMaximo) + " no eixo X e " + String.format("%,.2f", yMinimo) + " e " + String.format("%,.2f", yMaximo) + " no eixo Y.";
        }
        return "Erro ao executar método.";
    }

}