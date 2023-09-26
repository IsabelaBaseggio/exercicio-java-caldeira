import java.time.LocalDate;
import java.util.Scanner;

public class Reserva {
    private String nome;
    private String cpf;
    private String local;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String cpf, String local) {
        if(validarCPF(cpf) && !nome.isEmpty() && !local.isEmpty()) {
            this.nome = nome;
            this.cpf = cpf;
            this.local = local;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    private boolean validarCPF(String cpf) {
        if(cpf.length() != 11 || cpf.equals("00000000000")){
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

    public void setDataEntrada(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a data de entrada.");
        System.out.print("[dd/mm/aaaa]: ");
        String dataEntrada = scan.nextLine();
        dataEntrada = dataEntrada.replaceAll("/", "");

        while (dataEntrada.length() != 8 && !validarData(dataEntrada)) {
            System.out.println("Data inválida. Tente novamente.");
            System.out.print("[dd/mm/aaaa]: ");
            dataEntrada = scan.nextLine();
        }

        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informa a data de saída ou deixe o campo vazio.");
        System.out.print("[dd/mm/aaaa]: ");
        String dataSaida = scan.nextLine();

        dataSaida = dataSaida.replaceAll("/", "");

        while ((dataSaida.length() != 8 && !this.validarData(dataSaida) && !this.compararDatas(dataSaida)) || !dataSaida.isEmpty()) {
            System.out.println("Data inválida. Tente novamente.");
            System.out.print("[dd/mm/aaaa]: ");
            dataSaida = scan.nextLine();
        }

        if (!dataSaida.isEmpty()) {
            this.dataSaida = dataSaida;
        } else {
            this.dataSaida = "X";
        }
    }

    private boolean validarData(String data) {
        LocalDate dataAtual = LocalDate.now();
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(2, 4));
        int ano = Integer.parseInt(data.substring(4, 8));

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();
        if (ano > anoAtual){
            return true;
        } else if (ano == anoAtual) {
            if (mes > mesAtual) {
                return true;
            } else if (mes == mesAtual) {
                if (dia >= diaAtual) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean compararDatas(String dataSaida) {
        int diaEntrada = Integer.parseInt(this.dataEntrada.substring(0, 2));
        int mesEntrada = Integer.parseInt(this.dataEntrada.substring(2, 4));
        int anoEntrada = Integer.parseInt(this.dataEntrada.substring(4, 8));

        int diaSaida = Integer.parseInt(dataSaida.substring(0,2));
        int mesSaida = Integer.parseInt(dataSaida.substring(2, 4));
        int anoSaida = Integer.parseInt(dataSaida.substring(4, 8));

        if (anoSaida > anoEntrada) {
            return true;
        } else if (anoSaida == anoEntrada) {
            if (mesSaida > mesEntrada) {
                return true;
            } else if (mesSaida == mesEntrada) {
                if (diaSaida >= diaEntrada) {
                    return true;
                }
            }
        }
        return false;
    }

    public void alterarDataEntrada(){
        this.setDataEntrada();
        if ("X".equals(this.dataSaida)){
            this.setDataSaida();
        }
        System.out.println("Data(s) alterada(s) com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void alterarLocal(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o  novo local: ");
        String novoLocal = scan.nextLine();

        while (!novoLocal.isEmpty()) {
            System.out.println("Dado inválido. Tente novamente.");
            System.out.print("Novo local: ");
            novoLocal = scan.nextLine();
        }

        this.local = novoLocal;
        System.out.println("Local alterado com sucesso!");
    }
}
