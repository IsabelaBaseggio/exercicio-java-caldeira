import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private String cpf;

    private static int contaGerada = 9524;

    private int identificadorConta;
    private String banco = "Agibank";
    private String endereco;
    private double saldo = 0;
    private LocalTime horarioAtual = LocalTime.now();
    private DateTimeFormatter horarioFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
    private String horarioAtualFormatado = this.horarioAtual.format(this.horarioFormato);

    private boolean contaAtiva = true;

    private ArrayList<String> historicoConta = new ArrayList<String>();

    private LocalDateTime dataMovimentacao = LocalDateTime.now();

    private DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");

    private String dataMovimentacaoFormatado = this.dataMovimentacao.format(this.dataFormato);


    public ContaBancaria( String nome, String cpf, String endereco) {
        if (this.validarCpf(cpf)) {
            if(nome.length() > 5 && endereco.length() > 5) {
                this.nome = nome;
                this.cpf = cpf;
                ContaBancaria.contaGerada += 10;
                this.identificadorConta = ContaBancaria.contaGerada;
                this.endereco = endereco;
                this.atualizarDataMovimentacao();
                this.historicoConta.add(this.dataMovimentacaoFormatado + "          " + "Conta criada");
            } else {
                System.out.println("Erro ao abrir conta.");
            }
        } else {
            this.contaAtiva = false;
            System.out.println("Erro ao abrir conta.");
        }

    }

    public boolean validarCpf(String cpf) {
        if(cpf.length() != 11){
            return false;
        }

        int[] cpfArray = new int[11];

        int primeiroDigito = 0;
        int segundoDigito = 0;

        for(int i = 0; i < 11; i++){
            cpfArray[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }

        for(int i = 10; i > 1; i--){
            primeiroDigito += i * cpfArray[10 - i];
        }

        primeiroDigito *= 10;

        if(primeiroDigito % 11 == cpfArray[9]) {

            for (int i = 11; i > 1; i--) {
                segundoDigito += i * cpfArray[11 - i];
            }

            segundoDigito *= 10;

            if (segundoDigito % 11 != cpfArray[10]) {
                return false;
            }

        } else {

            return false;

        }

        return true;
    }

    public void verificarSaldo() {
        if (this.contaAtiva){
            System.out.println("Saldo: R$" + this.saldo);
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    private void atualizarHorario(){
        this.horarioAtual = LocalTime.now();
        this.horarioFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.horarioAtualFormatado = this.horarioAtual.format(this.horarioFormato);
    }


    public String verificarHorario() {
        if (!this.contaAtiva) {
            return "Erro ao realizar operação. Conta inativa.";
        }

        this.atualizarHorario();
        return this.horarioAtualFormatado;
    }

    private void atualizarDataMovimentacao() {
        this.dataMovimentacao = LocalDateTime.now();
        this.dataFormato = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        this.dataMovimentacaoFormatado = this.dataMovimentacao.format(this.dataFormato);
    }

    public void sacar(double valor) {
        if (this.contaAtiva) {
            if(valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                this.atualizarDataMovimentacao();
                this.historicoConta.add(this.dataMovimentacaoFormatado + "          " + "Saque: -R$" + String.format("%,.2f", valor));
            } else {
                System.out.println("Erro ao realizar saque.");
            }
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void depositar(double valor) {
        if (this.contaAtiva) {
            if(valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso!");
                this.atualizarDataMovimentacao();
                this.historicoConta.add(this.dataMovimentacaoFormatado + "          " + "Depósito: R$" + String.format("%,.2f", valor));
            } else {
                System.out.println("Erro ao realizar depósito.");
            }
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void realizarPix(String tipoChave, ContaBancaria chave, double valor) {
        if (this.contaAtiva) {
            boolean tipoChaveEValido = tipoChave.equalsIgnoreCase("cpf") || tipoChave.equalsIgnoreCase("cnpj") || tipoChave.equalsIgnoreCase("email") || tipoChave.equalsIgnoreCase("celular") || tipoChave.equalsIgnoreCase("chave aleatória");

            if (tipoChaveEValido && valor > 0 && valor <= this.saldo && chave.contaAtiva) {
                this.saldo -= valor;
                chave.saldo += valor;
                System.out.println("Pix realizado com sucesso " + this.horarioAtualFormatado);
                this.atualizarDataMovimentacao();
                this.historicoConta.add(this.dataMovimentacaoFormatado + "          " + "Pix: -R$" + String.format("%,.2f", valor));
            } else {
                System.out.println("Erro ao realizar pix.");
            }
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (this.contaAtiva) {
            int hora = LocalTime.now().getHour();
            int minuto = LocalTime.now().getMinute();
            int segundo = LocalTime.now().getSecond();

            if(contaDestino.contaAtiva && valor > 0 && valor <= this.saldo && hora >= 7 && hora < 19 || (hora == 19 && minuto == 0 && segundo == 0)) {
                contaDestino.saldo += valor;
                this.saldo -= valor;
                System.out.println("Transferência realizada com sucesso!");
                this.atualizarDataMovimentacao();
                this.historicoConta.add(this.dataMovimentacaoFormatado + "          " + "Transferência: -R$" + String.format("%,.2f", valor));
            } else {
                System.out.println("Erro ao realizar transferencia.");
            }
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void verificarInformacoes(){
        if (this.contaAtiva) {
            System.out.println("Banco: " + this.banco + "\n" +
                    "Número da Conta: " + this.identificadorConta + "\n" +
                    "Nome do titular: " + this.nome + "\n" +
                    "CPF: " + this.cpf + "\n" +
                    "Endereço: " + this.endereco + "\n" +
                    "Saldo: R$" + this.saldo);
        } else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void alterarEndereco(String novoEndereco) {
        if (this.contaAtiva) {
           if (novoEndereco.length() > 5) {
               this.endereco = novoEndereco;
               System.out.println("Novo endereço cadastrado com sucesso!");
           } else {
               System.out.println("Erro ao cadastrar novo endereço.");
           }
        }else {
            System.out.println("Erro ao realizar operação. Conta inativa.");
        }
    }

    public void mostrarHistoricoConta() {
        if(this.contaAtiva) {
            for(int i = 0; i < this.historicoConta.size(); i++){
                System.out.println(this.historicoConta.get(i));
            }
            System.out.println("Saldo atual:                 R$" + String.format("%,.2f", this.saldo));
        }
    }


    public void fecharConta() {
        if(this.contaAtiva) {
            this.contaAtiva = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }
}
