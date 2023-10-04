public enum OperacaoMatematica {
    SOMA("+"), SUBTRACAO("-"), MULTIPLICACAO("*"), DIVISAO("/");

    public String operacao;
    OperacaoMatematica(String operacaoEscolhida) {
        operacao = operacaoEscolhida;
    }
}
