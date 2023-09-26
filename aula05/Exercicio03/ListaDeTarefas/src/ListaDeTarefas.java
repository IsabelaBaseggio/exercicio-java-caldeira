import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    private static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();



    public ListaDeTarefas(){}

    public void adicionarTarefa(String titulo, String data, String descricao) {
        Tarefa tarefa = new Tarefa(titulo, data, descricao);
        listaDeTarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println(tarefa.getData() + " - " + tarefa.getTitulo() + ": " + tarefa.getDescricao());
        }
    }

    public void excluirTarefa() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println("[" + (i+1) + "] " + listaDeTarefas.get(i).getData() + " - " + listaDeTarefas.get(i).getTitulo() + ": " + listaDeTarefas.get(i).getDescricao());
        }
        System.out.println("[" + listaDeTarefas.size() + "] - CANCELAR");
        System.out.println("Informe o número da tarefa que você deseja excluir ou a opção de cancelar.");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        while (opcao < 1 || opcao > listaDeTarefas.size()) {
            System.out.print("Informe uma opção válida: ");
            opcao = scan.nextInt();
        }

        if (opcao < listaDeTarefas.size()) {
            listaDeTarefas.remove(opcao - 1);
            System.out.println("Tarefa excluída com sucesso!");
        } else {
            System.out.println("Operação cancelada com sucesso!");
        }
    }
}
