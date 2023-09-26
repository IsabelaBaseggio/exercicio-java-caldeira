import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

    private ArrayList<Compra> listaDeCompras = new ArrayList<>();

    public ListaDeCompras(){}

    public void adicionarItem(String item, int quantidade, String dataDeValidade){
        Compra compra = new Compra(item, quantidade, dataDeValidade);
        listaDeCompras.add(compra);
        System.out.println("Item adicionado com sucesso!");
    }

    public void exibirListaDeCompras() {
        for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println("["+ (i+1) + "] " + listaDeCompras.get(i).getQuantidade() + " " + listaDeCompras.get(i).getNome() + " - Validade: " + listaDeCompras.get(i).getDataDeValidade());
        }
    }

    public void alterarQuantidade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o item que deseja alterar a quantidade ou a opção CANCELAR");
        this.exibirListaDeCompras();
        System.out.println("[" + (listaDeCompras.size() + 1) + "] CANCELAR");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        while (opcao < 1 || opcao > (listaDeCompras.size() + 1)) {
            System.out.print("Escolha uma opção válida: ");
            opcao = scan.nextInt();
        }

        if (opcao == (listaDeCompras.size() + 1)) {
            System.out.println("Opção cancelada com sucesso!");
        } else {
            System.out.println("Nova quantidade: ");
            int quantidade = scan.nextInt();

            while (quantidade < 0) {
                System.out.println("Quantidade inválidada. Tente novamente.");
                System.out.println("Nova quantidade: ");
                quantidade = scan.nextInt();
            }

            if (quantidade == 0) {
                listaDeCompras.remove(opcao - 1);
                System.out.println("Item removido com sucesso!");
            } else {
                listaDeCompras.get(opcao - 1).setQuantidade(quantidade);
                System.out.println("Quantidade alterada com sucesso!");
            }
        }
    }

    public void excluirItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o item que deseja excluir ou a opção de CANCELAR");
        this.exibirListaDeCompras();
        System.out.println("[" + (listaDeCompras.size()+1) + "] CANCELAR");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        while (opcao < 1 || opcao > (listaDeCompras.size()+1)) {
            System.out.print("Escolha uma opção válida: ");
            opcao = scan.nextInt();
        }

        if (opcao < (listaDeCompras.size() + 1)) {
            listaDeCompras.remove(opcao - 1);
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Operação cancelada com sucesso!");
        }
    }
}
