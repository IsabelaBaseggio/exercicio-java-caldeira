package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculadoraDeHipoteca extends CalculadoraBasica {
    public CalculadoraDeHipoteca(){}

    NumberFormat formatter = new DecimalFormat("0.00");

    public double calculaHipotecaMensalComJuros(double valorEmprestimo, double taxaJurosAnual, double prazoEmAnos){
        if (prazoEmAnos > 0 && taxaJurosAnual > 0 && valorEmprestimo > 0){
            double taxaJurosMensal = divisao(divisao(taxaJurosAnual, 100), 12);
            double prazoEmMeses = multiplicacao(prazoEmAnos, 12);

            // o pagamento mensal é igual ao valorEmprestimo multiplicado pela taxaJurosMensal e pelo quociente de (1 + taxaJurosMensal) elevado a prazoEmMeses sobre (1 + taxaJurosMensal) elevado a prazoEmMeses menos 1
            // valor = valorEmprestimo * ((taxaJurosMensal * (1 + taxaJurosMensal) ^ prazoEmMeses) / ((1 + taxaJurosMensal) ^ prazoEmMeses - 1));
            double valorMensalComJuros = multiplicacao(valorEmprestimo, divisao(multiplicacao(taxaJurosMensal, potencia(soma(1, taxaJurosMensal), prazoEmMeses)), subtracao(potencia(soma(1, taxaJurosMensal), prazoEmMeses), 1)));
            return Double.parseDouble(formatter.format(valorMensalComJuros));
        }
        System.out.println("Os valores informados precisam ser positivos");
        return 0.00;
    }

    public double calculaHipotecaMensalSemJuros(double valorEmprestimo, double prazoEmAnos){
        if (valorEmprestimo > 0 && prazoEmAnos > 0) {
            double prazoEmMeses = multiplicacao(prazoEmAnos, 12);

            double valorMensalSemJuros = divisao(valorEmprestimo, prazoEmMeses);
            return Double.parseDouble(formatter.format(valorMensalSemJuros));
        }
        System.out.println("Os valores informados precisam ser positivos");
        return 0.00;
    }
}
