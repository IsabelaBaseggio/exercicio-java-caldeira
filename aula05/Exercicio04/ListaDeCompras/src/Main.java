public class Main {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();

        listaDeCompras.adicionarItem("Maçã", 4, "2 meses");
        listaDeCompras.adicionarItem("Arroz", 2, "09/24");
        listaDeCompras.adicionarItem("Leite", 1, "3 meses");
        listaDeCompras.adicionarItem("Ração de gato", 1, "10/24");

        listaDeCompras.exibirListaDeCompras();

        listaDeCompras.alterarQuantidade();

        listaDeCompras.exibirListaDeCompras();

        listaDeCompras.excluirItem();

        listaDeCompras.exibirListaDeCompras();
    }
}