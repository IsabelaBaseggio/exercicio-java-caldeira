package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculadoraDeHipotecaTest {
    public CalculadoraDeHipoteca calculadoraDeHipoteca = new CalculadoraDeHipoteca();

    @Test
    void calculaHipotacalMensalComJurosComSucesso(){
        double valorMensal;
        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalComJuros(200000,2,10);
        Assertions.assertEquals(1840.4, valorMensal);

        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalComJuros(180000,3.5,7.5);
        Assertions.assertEquals(2276.82, valorMensal);
    }

    @Test
    void calculaHipotecaMensalComJurosSemSucesso(){
        double valorMensal;
        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalComJuros(0,2,3);
        Assertions.assertEquals(0.0, valorMensal);

        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalComJuros(2000,0,3);
        Assertions.assertEquals(0.0, valorMensal);

        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalComJuros(2000,2,0);
        Assertions.assertEquals(0.0, valorMensal);
    }

    @Test
    void calculaHipotecalMensalSemJurosComSucesso(){
        double valorMensal;
        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalSemJuros(200000, 10);
        Assertions.assertEquals(1666.67, valorMensal);

        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalSemJuros(180000, 7.5);
        Assertions.assertEquals(2000.0, valorMensal);
    }

    @Test
    void calculaHipotecaMensalSemJurosSemSucesso(){
        double valorMensal;
        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalSemJuros(0, 3);
        Assertions.assertEquals(0.0, valorMensal);

        valorMensal = calculadoraDeHipoteca.calculaHipotecaMensalSemJuros(2000, 0);
        Assertions.assertEquals(0.0, valorMensal);
    }
}
