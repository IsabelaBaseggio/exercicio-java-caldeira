public class Documento {
    private String nome;
    private int numeroDePaginas;

    public Documento(String nome, int numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
        System.out.println("Número de páginas alterado com sucesso!");
    }

}
