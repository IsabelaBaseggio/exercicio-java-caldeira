public class Pessoa {
    private String nome;

    private int idade;

    private int chave;

    public Pessoa(String nome, int idade, int chave){
        this.nome = nome;
        this.idade = idade;
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getChave() {
        return chave;
    }
}
