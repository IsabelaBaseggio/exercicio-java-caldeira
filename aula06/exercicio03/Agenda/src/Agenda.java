import java.util.*;

public class Agenda {

    private Map<String, Contato> agenda = new TreeMap<>();

    public Agenda(){}

    public void adicionarContato(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Número: ");
        String numero = scan.nextLine();
        System.out.print("Endereço: ");
        String endereco = scan.nextLine();
        System.out.print("Local da cidade [norte / sul / leste / oeste]: ");
        String localDaCidade = scan.nextLine();

        if (nome.isEmpty() || numero.isEmpty() || endereco.isEmpty() || localDaCidade.isEmpty()) {
            System.out.println("Os campos precisam ser preenchidos. \n");
            this.adicionarContato();
        }

        Contato contato = new Contato(numero, endereco, localDaCidade);
        agenda.put(nome, contato);

        System.out.println("Contato adicionado com sucesso! \n");
    }

    public void listarContatosOrdemAlfabetica(){

        for (Map.Entry<String, Contato> contato: this.agenda.entrySet()) {
            System.out.println("Nome: " + contato.getKey() + "\n" +
                                "Número: " + contato.getValue().getNumero() + "\n" +
                                "Endereço: " + contato.getValue().getEndereco() + " - Zona: " + contato.getValue().getLocalDaCidade() + "\n");
        }
    }

    public void listarPorRegiao(String regiao){
        int contatoPorRegiao = 0;
        for (Map.Entry<String, Contato> contato: this.agenda.entrySet()) {
            if (regiao.equalsIgnoreCase(contato.getValue().getLocalDaCidade())) {
                contatoPorRegiao++;
                System.out.println("Nome: " + contato.getKey() + "\n" +
                                    "Número: " + contato.getValue().getNumero() + "\n" +
                                    "Endereço: " + contato.getValue().getEndereco() + "\n");
            }
        }

        if(contatoPorRegiao == 0) {
            System.out.println("Não há contatos salvos com essa região. \n");
        }
    }
}
