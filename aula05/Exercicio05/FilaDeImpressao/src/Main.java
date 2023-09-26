public class Main {
    public static void main(String[] args) {
        Impressao listaDeImpressao = new Impressao();

        listaDeImpressao.adicionarDocumentoNaLista("Aula 5 PDF", 10);
        listaDeImpressao.adicionarDocumentoNaLista("TCC", 30);
        listaDeImpressao.adicionarDocumentoNaLista("Resumo Java", 10);
        listaDeImpressao.adicionarDocumentoNaLista("Documento", 5);

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.alterarNumeroDePaginas();

        System.out.println(" ");

        listaDeImpressao.excluirDocumento();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.imprimirLista();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.adicionarDocumentoNaLista("Receitas", 5);
        listaDeImpressao.adicionarDocumentoNaLista("Doc", 15);

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();

        System.out.println(" ");

        listaDeImpressao.esvaziarLista();

        System.out.println(" ");

        listaDeImpressao.listarDocumentos();
    }
}