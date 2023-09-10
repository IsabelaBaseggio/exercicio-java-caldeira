import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        System.out.println("Conversor de Celsius para Fahrenheit");

        Scanner scan = new Scanner(System.in);

        System.out.print("Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}