import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaInteiros implements Calculavel{
    private int primeiroNumero;
    private int segundoNumero;

    private double total;

    public CalculaInteiros(){};

    public double escolherOperacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a operação que deseja realizar: \n" +
                            "[1] " + OperacaoMatematica.SOMA + "\n" +
                            "[2] "+ OperacaoMatematica.SUBTRACAO +" \n" +
                            "[3] " + OperacaoMatematica.MULTIPLICACAO + " \n" +
                            "[4] " + OperacaoMatematica.DIVISAO);
        System.out.print("Opção: ");
        try {
            int opcao = scan.nextInt();

            switch (opcao) {
                case(1):
                    return this.soma();
                case (2):
                    return this.subtracao();
                case (3):
                    return this.multiplicacao();
                case(4):
                    return this.divisao();
                default:
                    throw new IllegalArgumentException("A opção escolhida não é válida.");
            }
        }catch (InputMismatchException exception){
            System.out.println("A opção escolhida não é válida.");
        }
        catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        return 0;
    }

    @Override
    public double soma() {
        Scanner scan = new Scanner(System.in);

        System.out.println("*** SOMA ***");
        try {
            System.out.print("Primeiro Número: ");
            this.primeiroNumero = scan.nextInt();

            System.out.print("Segundo Número: ");
            this.segundoNumero  = scan.nextInt();

            this.total = this.primeiroNumero + this.segundoNumero;

            return this.total;
        } catch (InputMismatchException exception) {
            System.out.println("O valores precisam ser inteiros.");
        }

        scan.close();
        return 0;
    }

    @Override
    public double subtracao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** SUBTRAÇÃo ***");
        try{
            System.out.print("Primeiro Número: ");
            this.primeiroNumero = scan.nextInt();

            System.out.print("Segundo Número: ");
            this.segundoNumero = scan.nextInt();

            this.total = this.primeiroNumero - this.segundoNumero;

            return this.total;
        } catch (InputMismatchException exception) {
            System.out.println("Os valores precisam ser inteiros");
        }
        scan.close();
        return 0;
    }

    @Override
    public double multiplicacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** MULTIPLICAÇÃO ***");
        try {
            System.out.print("Multiplicador: ");
            this.primeiroNumero = scan.nextInt();

            System.out.print("Multiplicando: ");
            this.segundoNumero = scan.nextInt();

            this.total = this.segundoNumero * this.primeiroNumero;

            return this.total;
        } catch (InputMismatchException exception) {
            System.out.println("Os valores precisam ser positivos");
        }
        scan.close();
        return 0;
    }

    @Override
    public double divisao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** DIVISÃO ***");
        try {
            System.out.print("Dividendo: ");
            this.primeiroNumero = scan.nextInt();

            System.out.print("Divisor: ");
            this.segundoNumero = scan.nextInt();
            if(this.segundoNumero < 1) {
                throw new IllegalArgumentException("O valor do dividor presisa ser um número inteiro maior que zero.");
            }

            this.total = this.primeiroNumero / this.segundoNumero;

            return this.total;

        } catch (InputMismatchException exception){
            System.out.println("Os valores digitados precisam ser inteiros.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        scan.close();
        return 0;
    }


}
