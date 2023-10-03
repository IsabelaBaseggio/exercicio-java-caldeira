public class Quadrado implements Desenhavel{

    public Quadrado(){}
    @Override
    public String desenhar() {
        return "Vou desenhar o " + this.getClass().getName();
    }
}
