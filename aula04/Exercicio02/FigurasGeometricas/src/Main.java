import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> listaFormaGeometricas = new ArrayList<FormaGeometrica>();

        FormaGeometrica retangulo = new Retangulo(10, 5);
        listaFormaGeometricas.add(retangulo);

        FormaGeometrica circulo = new Circulo(4.5);
        listaFormaGeometricas.add(circulo);

        FormaGeometrica triangulo = new Triangulo(5, 3);
        listaFormaGeometricas.add(triangulo);

        FormaGeometrica quadrado = new Quadrado(4);
        listaFormaGeometricas.add(quadrado);

        FormaGeometrica losango = new Losango(3,5);
        listaFormaGeometricas.add(losango);

        for(int i = 0; i < listaFormaGeometricas.size(); i++){
            System.out.println("A área do " + listaFormaGeometricas.get(i).tipo + " é " + String.format("%,.4f", listaFormaGeometricas.get(i).calcularArea()) + " cm².");
        }
    }
}