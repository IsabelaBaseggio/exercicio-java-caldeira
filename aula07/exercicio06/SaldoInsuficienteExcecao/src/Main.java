public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try {
            conta.sacar(120);
        } catch (SaldoInsuficienteException exception) {
            System.out.println("Erro ao realizar operação.");
            System.out.println("Erro: " + exception.getMessage());
        }
    }
}