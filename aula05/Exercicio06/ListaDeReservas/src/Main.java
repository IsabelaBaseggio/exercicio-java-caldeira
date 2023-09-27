public class Main {
    public static void main(String[] args) {
        ListaDeReservas listaDeReservas = new ListaDeReservas();

        listaDeReservas.reservarPassagem("Isabela", "32601178221", "Rio de Janeiro - RJ", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Isabela", "32601178221", "Rio de Janeiro - RJ", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Isabela", "00000000000", "Rio de Janeiro - RJ", 2);

        System.out.println(" ");

        listaDeReservas.reservarPassagem("Rafael", "32601178221", "São Paulo - SP", 2);

        System.out.println(" ");

        listaDeReservas.listarReservas();

        System.out.println(" ");

        listaDeReservas.alterarDataDeReserva("04871216004");

        System.out.println(" ");

        listaDeReservas.alterarLocalDaPassagem("04871216004");

        System.out.println(" ");

        listaDeReservas.alterarQuantidadeDePassagem("04871216004");

        System.out.println(" ");

        listaDeReservas.listarReservas();

        System.out.println(" ");

        listaDeReservas.cancelarReserva("04871216004");



    }
}
