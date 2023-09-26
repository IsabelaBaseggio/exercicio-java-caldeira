public class Compra {
    private String nome;

    private int quantidade;
    private String dataDeValidade;

    public Compra(String nome, int quantidade, String dataDeValidade) {
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataDeValidade() {
        return this.dataDeValidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
