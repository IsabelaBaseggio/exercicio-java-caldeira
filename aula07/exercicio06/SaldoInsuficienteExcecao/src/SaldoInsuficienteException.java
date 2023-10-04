public class SaldoInsuficienteException extends Exception{
    @Override
    public String getMessage() {
        return "Saldo insuficiente.";
    }
}
