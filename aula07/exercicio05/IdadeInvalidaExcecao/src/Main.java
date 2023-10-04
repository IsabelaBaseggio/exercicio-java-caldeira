public class Main {
    public static void main(String[] args) {
        try{
            Idade idade = new Idade(180);
        } catch (IdadeInvalidadeException exception) {
            System.out.println("A idade não foi salva.");
            System.out.println("Erro: " + exception.getMessage());
        }
    }
}