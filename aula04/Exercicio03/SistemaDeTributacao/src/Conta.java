public class Conta {
    protected double saldo;

    protected double obterSaldo(){
        return this.saldo;
    }

    protected double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return this.saldo;
        }
        return this.saldo;
    }

    protected double sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return this.saldo;
        }
        return this.saldo;
    }

}
