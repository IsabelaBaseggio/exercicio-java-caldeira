public class Main {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Fazer exercícios", "25/09", "Concluir os exercícios da aula 5");

        listaDeTarefas.adicionarTarefa("Estudar Java", "25/09", "Revisar estrutura de dados com Java");

        listaDeTarefas.adicionarTarefa("Faculdade", "26/09", "Terminar resumo de mobile");

        listaDeTarefas.listarTarefas();

        listaDeTarefas.excluirTarefa();

        listaDeTarefas.listarTarefas();

    }
}