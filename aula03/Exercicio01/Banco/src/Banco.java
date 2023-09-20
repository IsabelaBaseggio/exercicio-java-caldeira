public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Isabela", "04871216004", "Caldeira");

        conta.depositar(2000);

        conta.verificarInformacoes();

        ContaBancaria conta2 = new ContaBancaria("Outra pessoa", "04871216004", "Instituto");

        conta2.verificarInformacoes();

        conta.transferir(conta2, 1);

        conta2.depositar(100);

        conta.fecharConta();

        conta.depositar(100);

    }
}