import java.util.ArrayList;

public class TesteTributavel {
    public static void main(String[] args) {
        ArrayList<Tributavel> tributaveis = new ArrayList<Tributavel>();

        ContaCorrente contaConcorrente = new ContaCorrente();
        contaConcorrente.depositar(50);
        System.out.println(contaConcorrente.calculaTributos());
        tributaveis.add(contaConcorrente);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(50);
        System.out.println(contaPoupanca.calculaTributos());
        tributaveis.add(contaPoupanca);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println(seguroDeVida.calculaTributos());
        tributaveis.add(seguroDeVida);

        GerenciadorDeImpostoDeRenda gerenciadorDeImpostoDeRenda = new GerenciadorDeImpostoDeRenda();

        for (int i = 0; i < tributaveis.size(); i++) {
            gerenciadorDeImpostoDeRenda.adicionar(tributaveis.get(i));
        }

        double totalTributos = gerenciadorDeImpostoDeRenda.somaTotal();
        System.out.println(totalTributos);

    }
}