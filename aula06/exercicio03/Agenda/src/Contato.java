public class Contato {
    private String numero;
    private String endereco;
    private String localDaCidade;

    public Contato(String numero, String endereco, String localDaCidade){
        this.numero = numero;
        this.endereco = endereco;
        this.localDaCidade = localDaCidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocalDaCidade() {
        return localDaCidade;
    }
}
