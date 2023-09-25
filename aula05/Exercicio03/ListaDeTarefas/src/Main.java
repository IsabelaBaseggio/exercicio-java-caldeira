public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        Tarefa tarefa1 = new Tarefa("Fazer exercícios", "25/09", "Concluir os exercícios da aula 5");
        listaDeTarefas.adicionarTarefas(tarefa1);

        Tarefa tarefa2 = new Tarefa("Estudar Java", "25/09", "Revisar estrutura de dados com Java");
        listaDeTarefas.adicionarTarefas(tarefa2);

        Tarefa tarefa3 = new Tarefa("Faculdade", "26/09", "Terminar resumo de mobile");
        listaDeTarefas.adicionarTarefas(tarefa3);

        listaDeTarefas.listarTarefas();

        listaDeTarefas.excluirTarefa();

        listaDeTarefas.listarTarefas();

    }
}