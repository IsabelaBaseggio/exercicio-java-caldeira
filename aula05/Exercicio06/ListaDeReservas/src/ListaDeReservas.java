import java.util.LinkedList;
import java.util.Scanner;

public class ListaDeReservas {


    LinkedList<Reserva> listaDeReservas = new LinkedList<>();

    public ListaDeReservas(){}

    public void reservarPassagem(String nome, String cpf, String local, int quantidadeDePassagens){
        ValidaCpf validaCpf = new ValidaCpf();
        if (validaCpf.validarCPF(cpf) && !nome.isEmpty() && !local.isEmpty() && quantidadeDePassagens > 0){
            Reserva passagem = new Reserva(nome, cpf, local, quantidadeDePassagens);
            passagem.setDataEntrada();
            passagem.setDataSaida();

            listaDeReservas.add(passagem);

            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Erro ao reservar passagem");
        }

    }

    public void listarReservas(){
            if (!listaDeReservas.isEmpty()){
                for (int i = 0; i < listaDeReservas.size(); i++){
                    String comecoCPF = this.listaDeReservas.get(i).getCpf().substring(0, 3);
                    String finalCPF = this.listaDeReservas.get(i).getCpf().substring(8, 11);
                    System.out.println("[" + (i + 1) + "] " + listaDeReservas.get(i).getNome() + " - CPF: " + comecoCPF + "xxxxx" + finalCPF + "\n" +
                            "    Local: " + listaDeReservas.get(i).getLocal() + "\n" +
                            "    Quantidade de Passagens: " + listaDeReservas.get(i).getQuantidadeDePassagens() + "\n" +
                            "    Data de Entrada: " + listaDeReservas.get(i).getDataEntrada() + "\n" +
                            "    Data de Saída: " + listaDeReservas.get(i).getDataSaida());
                    System.out.println(" ");
                }
            } else {
                System.out.println("Lista de reservas está vazia.");
            }
    }

    public void cancelarReserva(String cpfReserva) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informe a reserva que deseja cancelar ou a opção SAIR");
            this.listarReservas();
            System.out.println("[" + (this.listaDeReservas.size() + 1) + "] SAIR");
            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            while (opcao < 1 || opcao > this.listaDeReservas.size() + 1){
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
            }

            if (opcao != this.listaDeReservas.size() + 1) {
                if (cpfReserva.equals(this.listaDeReservas.get(opcao - 1).getCpf())) {
                    this.listaDeReservas.remove(opcao - 1);
                    System.out.println("Reserva cancelada com sucesso!");
                } else {
                    System.out.println("Você não tem permissão para cancelar essa reserva.");
                }
            } else {
                System.out.println("Operação cancelada com sucesso!");
            }

    }

    public void alterarDataDeReserva(String cpfReserva){
            Scanner scan = new Scanner(System.in);
            System.out.println("Informa a reverva que deseja alterar a data ou a opção SAIR");
            this.listarReservas();
            System.out.println("[" + (this.listaDeReservas.size() + 1) + "] SAIR");

            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            while (opcao < 1 || opcao > this.listaDeReservas.size() + 1){
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
            }

            if (opcao != this.listaDeReservas.size() + 1) {
                if (cpfReserva.equals(this.listaDeReservas.get(opcao - 1).getCpf())){
                    this.listaDeReservas.get(opcao - 1).alterarDataEntrada();
                } else {
                    System.out.println("Você não tem permissão para alterar as datas dessa passagem reservada.");
                }
            } else {
                System.out.println("Operação cancelada com sucesso!");
            }
    }

    public void alterarQuantidadeDePassagem(String cpfReserva){
            Scanner scan = new Scanner(System.in);
            System.out.println("Informa a reverva que deseja alterar a quantidade de passagem ou a opção SAIR");
            this.listarReservas();
            System.out.println("[" + (this.listaDeReservas.size() + 1) + "] SAIR");

            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            while (opcao < 1 || opcao > this.listaDeReservas.size() + 1){
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
            }

            if (opcao != this.listaDeReservas.size() + 1) {
                if (cpfReserva.equals(this.listaDeReservas.get(opcao - 1).getCpf())) {
                    System.out.println("Informe a nova quantidade de passagem: ");
                    int novaQuantidade = scan.nextInt();

                    while (novaQuantidade < 0) {
                        System.out.println("Valor inválido. Tente novamente.");
                        System.out.print("Nova quantidade: ");
                        novaQuantidade = scan.nextInt();
                    }

                    if (novaQuantidade != 0) {
                        this.listaDeReservas.get(opcao - 1).alterarQuantidadeDePassagens(novaQuantidade);
                    } else {
                        this.listaDeReservas.remove(opcao - 1);
                        System.out.println("Reserva cancelada com sucesso!");
                    }
                } else {
                    System.out.println("Você não tem permissão para alterar a quantidade de passagem dessa reserva.");
                }

            } else {
                System.out.println("Operação cancelada com sucesso!");
            }
    }

    public void alterarLocalDaPassagem(String cpfReserva){
            Scanner scan = new Scanner(System.in);
            System.out.println("Informa a reverva que deseja alterar o local ou a opção SAIR");
            this.listarReservas();
            System.out.println("[" + (this.listaDeReservas.size() + 1) + "] SAIR");

            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            while (opcao < 1 || opcao > this.listaDeReservas.size() + 1){
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("Opção: ");
                opcao = scan.nextInt();
            }

            if (opcao != this.listaDeReservas.size() + 1) {
                if (cpfReserva.equals(this.listaDeReservas.get(opcao - 1).getCpf())){
                    this.listaDeReservas.get(opcao - 1).alterarLocal();
                } else {
                    System.out.println("Você não tem permissão para alterar o local dessa passagem reservada");
                }
            } else {
                System.out.println("Operação cancelada com sucesso!");
            }
    }
}
