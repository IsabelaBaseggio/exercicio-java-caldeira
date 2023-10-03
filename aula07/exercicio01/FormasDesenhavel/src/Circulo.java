public class Circulo implements Desenhavel{

    public Circulo(){}
    @Override
    public String desenhar() {
        return "Vou desenhar o " + this.getClass().getName();
    }
}
