package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculadoraBasica {
    NumberFormat formatter = new DecimalFormat("0.000000");

    public CalculadoraBasica() {}

    public double soma(double valor1, double valor2){
        return Double.parseDouble(formatter.format(valor1 + valor2));
    }

    public double subtracao(double valor1, double valor2){
        return Double.parseDouble(formatter.format(valor1 - valor2));
    }

    public double multiplicacao(double fator1, double falor2) {
        return Double.parseDouble(formatter.format(fator1 * falor2));
    }

    public double divisao(double dividendo, double divisor){
        if (divisor != 0) return Double.parseDouble(formatter.format(dividendo / divisor));
        System.out.println("O divisor precisa ser diferente de 0");
        return 0.00;
    }

    public double raizQuadrada(double radicando){
        if(radicando > 0){
            return Double.parseDouble(formatter.format(Math.sqrt(radicando)));
        }
        System.out.println("O radicando precisa ser maior que 0");
        return 0.00;
    }

    public double potencia(double base, double expoente){
        return Double.parseDouble(formatter.format(Math.pow(base, expoente)));
    }
}
