import java.util.Stack;

public class Pilha {

    private Stack<Livro> pilha = new Stack<Livro>();

    public Pilha(){}

    public void adicionarNaPilha(String titulo, String categoria) {
        Livro livro = new Livro(titulo, categoria);

        this.pilha.push(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void percorrerPilha(){
        if(!this.pilha.empty()){
            for (Livro livro: this.pilha){
                System.out.println("Livro: " + livro.getTitulo() + " - Categoria: " + livro.getCategoria());
            }
        } else {
            System.out.println("A pilha está vazia");
        }
    }

    public void buscarPorCategoria(String categoria) {
        this.pilha.forEach(livro -> {
            if (livro.getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println("Livro: " + livro.getTitulo() + " - Categoria: " + livro.getCategoria());
            }
        });
    }

    public void esvaziarPilha(){
        if (!this.pilha.empty()){
            for (int i = this.pilha.size(); i > 0; i--) {
                Livro itemRemovidoDaPilha = this.pilha.pop();
                System.out.println("O livro '" + itemRemovidoDaPilha.getTitulo() + "' foi removido da pilha.");
            }
        } else {
            System.out.println("A pilha já está vazia");
        }
    }
}
