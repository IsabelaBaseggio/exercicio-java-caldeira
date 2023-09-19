public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Isabela", "768757", 1234, "Caldeira");

        conta.depositar(2000);

        ContaBancaria conta2 = new ContaBancaria("Outra pessoa", "3456", 9876, "Instituto");

        conta.transferir(conta2, 0);

        ContaBancaria contaTeste = new ContaBancaria();


    }
}