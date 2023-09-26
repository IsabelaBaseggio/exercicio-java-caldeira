public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 6");
        String data = "01234567";
        data = data.replaceAll("/", "");
        System.out.println(data);

        String novaString = data.substring(4,8);

        System.out.println(novaString);
    }
}