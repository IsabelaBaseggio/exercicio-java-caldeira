public class Main {
    public static void main(String[] args) {
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        listaDeProdutos.adicionarProduto("Leite", 4.75);
        listaDeProdutos.adicionarProduto("Arroz", 4.28);
        listaDeProdutos.adicionarProduto("Feijão", 4.78);
        listaDeProdutos.adicionarProduto("Massa", 3.30);

        listaDeProdutos.listarProdutos();
    }
}