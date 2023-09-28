import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adicionando livros na pilha:");
        Pilha pilha = new Pilha();
        pilha.adicionarNaPilha("Rejection Proof", "Autoajuda");
        pilha.adicionarNaPilha("Eu Tenho Sérios Poemas Mentais", "Poesia");
        pilha.adicionarNaPilha("Se você me entende, por favor me explica", "Poesia");
        pilha.adicionarNaPilha("A nuvem", "Ficção");
        pilha.adicionarNaPilha("Jantar secreto", "Suspense");

        System.out.println("\n Percorrendo a pilha de livros:");
        pilha.percorrerPilha();

        System.out.println("\n Buscando livros na pilha por categoria:");
        pilha.buscarPorCategoria("poesia");

        System.out.println("\n Removendo livros da pilha:");
        pilha.esvaziarPilha();

        System.out.println("\n Tentando percorrer a pilha vazia:");
        pilha.percorrerPilha();

    }
}