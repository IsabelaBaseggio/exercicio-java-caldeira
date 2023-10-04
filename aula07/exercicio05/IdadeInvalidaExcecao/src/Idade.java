public class Idade {

    private int idade;

    public Idade(int idade) throws IdadeInvalidadeException{
        if(idade < 0 || idade > 150) {
            throw new IdadeInvalidadeException("A idade é inválida.");
        } else {
            this.idade = idade;
            System.out.println("Idade salva com sucesso!");
        }

    }

}
