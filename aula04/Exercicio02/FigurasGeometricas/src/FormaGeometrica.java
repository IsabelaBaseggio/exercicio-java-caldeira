public abstract class FormaGeometrica {
    protected String tipo;

    protected String getTipo(){
        return this.tipo;
    }

    protected abstract double calcularArea();
}
