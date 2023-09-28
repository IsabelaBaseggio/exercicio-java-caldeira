import java.util.HashMap;
import java.util.Map;

public class Mapa {

    private Map<Pessoa, Integer> mapa = new HashMap<Pessoa, Integer>();

    private static int chave = 0;


    public Mapa(){}


    public void adicionarPessoa(String nome, int idade) {
        if (idade > 0) {
            chave++;
            Pessoa pessoa = new Pessoa(nome, idade, chave);
            this.mapa.put(pessoa, chave);
            System.out.println("Nome: " + nome + " - Idade: " + idade + " - Chave: " + chave);
            System.out.println("Adicionado com sucesso!");
        }
    }

    public void acessarIdadePessoa(String nomePesquisa){
        boolean existeNome = false;
        for (Map.Entry<Pessoa, Integer> pessoa: this.mapa.entrySet()){
            String nomePessoa = pessoa.getKey().getNome();

            existeNome = nomePesquisa.equalsIgnoreCase(nomePessoa);
            if (existeNome){
                System.out.println("Nome: " + nomePessoa + " - Idade: " + pessoa.getKey().getIdade());
            }
        }

        if (!existeNome) {
            System.out.println("Nome não encontrado.");
        }
    }

    public void acessarPessoasTerceiraIdade(){
        int quantidadePessoaTereiraIdade = 0;
        for (Map.Entry<Pessoa, Integer> pessoa: this.mapa.entrySet()){

            if (pessoa.getKey().getIdade() >= 60) {
                quantidadePessoaTereiraIdade++;
                System.out.println("Nome: " + pessoa.getKey().getNome() + " - " + pessoa.getKey().getIdade());
            }
        }

        if (quantidadePessoaTereiraIdade == 0) {
            System.out.println("Não há pessoa que estão na terceira idade.");
        }
    }
}
