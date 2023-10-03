import java.util.LinkedHashMap;
import java.util.Map;

public class ListaDeProdutos {
    private Map<String, Double> listaDeProdutos = new LinkedHashMap<>();

    public ListaDeProdutos(){}

    public void adicionarProduto(String nome, double preco) {
        this.listaDeProdutos.put(nome, preco);

        System.out.println("Produto adicionado com sucesso! \n");
    }

    public void listarProdutos() {
        if (!this.listaDeProdutos.isEmpty()) {
            for (Map.Entry<String, Double> produto: this.listaDeProdutos.entrySet()){
                System.out.println(produto.getKey() + " - R$" +  String.format("%,.2f", produto.getValue()));
            }
        } else {
            System.out.println("A lista de produtos está vazia");
        }
    }
}
