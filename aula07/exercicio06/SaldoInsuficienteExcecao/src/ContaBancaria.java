public class ContaBancaria {
    private double saldo = 100;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException();
        } else {
            this.saldo -= valor;
            System.out.println("Operação realizada com sucesso!");
        }
    }
}
