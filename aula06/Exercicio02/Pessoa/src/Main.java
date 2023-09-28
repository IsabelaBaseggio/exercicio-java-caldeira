import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        mapa.adicionarPessoa("Karol", 80);
        mapa.adicionarPessoa("Carol", 40);
        mapa.adicionarPessoa("Isabela", 100);

        System.out.println(" ");

        mapa.acessarIdadePessoa("Amanda");

        System.out.println(" ");

        mapa.acessarIdadePessoa("Karol");

        System.out.println(" ");

        mapa.acessarPessoasTerceiraIdade();
    }
}