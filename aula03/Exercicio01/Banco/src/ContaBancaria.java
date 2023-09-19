import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco = "YoursBank";
    private String endereco;
    private double saldo = 0;
    private LocalTime horarioAtual = LocalTime.now();
    private DateTimeFormatter horarioFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
    private String horarioAtualFormatado = this.horarioAtual.format(this.horarioFormato);


    public ContaBancaria( String nome, String cpf, int identificadorConta, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.endereco = endereco;
    }

    public boolean validarCpf(String cpf) {
        int[] cpfArray = new int[11];

        int primeiroDigito = 0;
        int segundoDIgito = 0;

        if(cpf.length() < 11){
            return false;
        }

        for(int i = 0; i < 11; i++){
            cpfArray[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        for(int i = 10; i > 1; i--){
            primeiroDigito +=
        }

        return false;
    }

    public void verificarSaldo() {
        System.out.println("Saldo: R$" + this.saldo);
    }

    private void atualizarHorario(){
        this.horarioAtual = LocalTime.now();
        this.horarioFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.horarioAtualFormatado = this.horarioAtual.format(this.horarioFormato);
    }


    public String verificarHorario() {
        this.atualizarHorario();
        return this.horarioAtualFormatado;
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Erro ao realizar saque.");
        }
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Erro ao realizar depósito.");
        }
    }

    public void realizarPix(String tipoChave, ContaBancaria chave, double valor) {
        boolean tipoChaveEValido = tipoChave.equalsIgnoreCase("cpf") || tipoChave.equalsIgnoreCase("cnpj") || tipoChave.equalsIgnoreCase("email") || tipoChave.equalsIgnoreCase("celular") || tipoChave.equalsIgnoreCase("chave aleatória");

        if (tipoChaveEValido || valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            chave.saldo += valor;
            System.out.println("Pix realizado com sucesso " + this.horarioAtualFormatado);
        } else {
            System.out.println("Erro ao realizar pix.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        int hora = LocalTime.now().getHour();
        int minuto = LocalTime.now().getMinute();
        int segundo = LocalTime.now().getSecond();

        if(valor > 0 && valor <= this.saldo && hora >= 7 && hora < 19 || (hora == 19 && minuto == 00 && segundo == 00)) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Erro ao realizar transferencia.");
        }
    }

    public void verificarInformacoes(){
        System.out.println("Banco: " + this.banco + "\n" +
                            "Número da Conta: " + this.identificadorConta + "\n" +
                            "Nome do titular: " + this.nome + "\n" +
                            "CPF: " + this.cpf + "\n" +
                            "Endereço: " + this.endereco + "\n" +
                            "Saldo: R$" + this.saldo);
    }
}
