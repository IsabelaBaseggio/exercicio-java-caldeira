public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 3");

        Agenda agenda = new Agenda();
        agenda.adicionarContato();
        agenda.adicionarContato();
        agenda.adicionarContato();
        agenda.adicionarContato();

        agenda.listarContatosOrdemAlfabetica();

        agenda.listarPorRegiao("sul");
    }
}