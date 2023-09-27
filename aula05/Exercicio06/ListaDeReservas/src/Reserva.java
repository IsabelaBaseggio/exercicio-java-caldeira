import java.time.LocalDate;
import java.util.Scanner;

public class Reserva {
    private String nome;
    private String cpf;
    private String local;

    private int quantidadeDePassagens;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String cpf, String local, int quantidadeDePassagens) {
            this.nome = nome;
            this.cpf = cpf;
            this.local = local;
            this.quantidadeDePassagens = quantidadeDePassagens;
    }


    public void setDataEntrada(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a data de entrada.");
        System.out.print("[dd/mm/aaaa]: ");
        String dataEntrada = scan.nextLine();

        while (dataEntrada.length() != 10 || !this.validarData(dataEntrada)) {
            System.out.println("Data inválida. Tente novamente.");
            System.out.print("Data de entrada [dd/mm/aaaa]: ");
            dataEntrada = scan.nextLine();
        }

        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informa a data de saída ou digite X para deixar a data em branco.");
        System.out.print("[dd/mm/aaaa]: ");
        String dataSaida = scan.nextLine();

        if ("X".equalsIgnoreCase(dataSaida)){
            this.dataSaida = dataSaida;
        } else {
            while (dataSaida.length() != 10 || !this.validarData(dataSaida) || !this.compararDatas(dataSaida)) {
                System.out.println("Data inválida. Tente novamente.");
                System.out.print("Data de Saída [dd/mm/aaaa]: ");
                dataSaida = scan.nextLine();

                if ("X".equalsIgnoreCase(dataSaida)){
                    break;
                }
            }

            this.dataSaida = dataSaida;
        }


    }

    private boolean validarData(String data) {
        data = data.replaceAll("/", "");
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
                return dia >= diaAtual;
            }
        }
        return false;
    }

    private boolean compararDatas(String dataSaida) {
        dataSaida = dataSaida.replaceAll("/", "");
        String dataEntrada = this.dataEntrada.replaceAll("/", "");
        int diaEntrada = Integer.parseInt(dataEntrada.substring(0, 2));
        int mesEntrada = Integer.parseInt(dataEntrada.substring(2, 4));
        int anoEntrada = Integer.parseInt(dataEntrada.substring(4, 8));

        int diaSaida = Integer.parseInt(dataSaida.substring(0,2));
        int mesSaida = Integer.parseInt(dataSaida.substring(2, 4));
        int anoSaida = Integer.parseInt(dataSaida.substring(4, 8));

        if (anoSaida > anoEntrada) {
            return true;
        } else if (anoSaida == anoEntrada) {
            if (mesSaida > mesEntrada) {
                return true;
            } else if (mesSaida == mesEntrada) {
                return diaSaida >= diaEntrada;
            }
        }
        return false;
    }

    public void alterarDataEntrada(){
        this.setDataEntrada();
            this.setDataSaida();
        System.out.println("Data(s) alterada(s) com sucesso!");
    }

    public void alterarQuantidadeDePassagens(int novaQuantidade){
        this.quantidadeDePassagens = novaQuantidade;
        System.out.println("Quantidade de passagens alterada!");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLocal() {
        return local;
    }

    public int getQuantidadeDePassagens() {
        return quantidadeDePassagens;
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

        while (novoLocal.isEmpty()) {
            System.out.println("Dado inválido. Tente novamente.");
            System.out.print("Novo local: ");
            novoLocal = scan.nextLine();
        }

        this.local = novoLocal;
        System.out.println("Local alterado com sucesso!");
    }

}
