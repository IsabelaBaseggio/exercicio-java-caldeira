import java.util.LinkedList;
import java.util.Scanner;

public class Impressao {

    private LinkedList<Documento> listaDeImpressao = new LinkedList<>();

    public Impressao() {}

    public void adicionarDocumentoNaLista(String nome, int numeroDePaginas){
        Documento documento = new Documento(nome, numeroDePaginas);
        listaDeImpressao.add(documento);
        System.out.println("Documento adicionado com sucesso!");
    }
    
    public void listarDocumentos(){
        if (this.listaDeImpressao.size() > 0) {
            for (int i = 0; i < listaDeImpressao.size(); i++){
                System.out.println("[" + (i+1) + "] " + listaDeImpressao.get(i).getNome() + " - " + listaDeImpressao.get(i).getNumeroDePaginas() + " página(s).");
            }
        } else {
            System.out.println("A lista de documetos para impressão está vazia.");
        }

    }

    public void alterarNumeroDePaginas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o documento que deseja alterar as páginas ou a opção CANCELAR" );
        this.listarDocumentos();
        System.out.println("[" + (this.listaDeImpressao.size() + 1) + "] CANCELAR");

        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        while (opcao < 1 || opcao > this.listaDeImpressao.size() + 1) {
            System.out.println("Opção inválida. Tente novamente.");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
        }

        if (opcao != this.listaDeImpressao.size() + 1) {
            System.out.print("Novo números de páginas: ");
            int numeroDePaginas = scan.nextInt();

            while(numeroDePaginas < 0) {
                System.out.println("Valor inválido. Tente novamente.");
                System.out.print("Novo números de páginas: ");
                numeroDePaginas = scan.nextInt();
            }

            if (numeroDePaginas == 0){
                this.listaDeImpressao.remove(opcao - 1);
                System.out.println("Documento excluído com sucesso!");
            } else {
                this.listaDeImpressao.get(opcao - 1).setNumeroDePaginas(numeroDePaginas);
            }
        } else {
            System.out.println("Opção cancelada com sucesso!");
        }
    }

    public void excluirDocumento(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o documento que deseja exluir ou a opção CANCELAR" );
        this.listarDocumentos();
        System.out.println("[" + (this.listaDeImpressao.size() + 1) + "] CANCELAR");

        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        while (opcao < 1 || opcao > this.listaDeImpressao.size() + 1) {
            System.out.println("Opção inválida. Tente novamente.");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
        }

        if (opcao != this.listaDeImpressao.size() + 1) {
            this.listaDeImpressao.remove(opcao - 1);
            System.out.println("Documento excluído com sucesso!");
        } else {
            System.out.println("Operação cancelada com sucesso!");
        }
    }

    public void imprimirLista() {
        for (Documento documeto: this.listaDeImpressao) {
            System.out.println("Documento: " + documeto.getNome() + " - " + documeto.getNumeroDePaginas() + " página(s) - Impresso com sucesso!");
        }
        this.esvaziarLista();
    }

    public void esvaziarLista() {
        this.listaDeImpressao.clear();
        System.out.println("Lista esvaziada com sucesso!");
    }
}
