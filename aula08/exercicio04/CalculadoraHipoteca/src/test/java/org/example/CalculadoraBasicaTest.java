package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculadoraBasicaTest {
    public CalculadoraBasica calculadora = new CalculadoraBasica();

    @Test
    void somarComSucesso(){
        double soma = calculadora.soma(10, 5);
        Assertions.assertEquals(15, soma);

        soma = calculadora.soma(20, 20);
        Assertions.assertEquals(40, soma);

        soma = calculadora.soma(37.5, 12.8);
        Assertions.assertEquals(50.3, soma);
    }

    @Test
    void subtracaoComSucesso(){
        double subtracao = calculadora.subtracao(10, 5);
        Assertions.assertEquals(5, subtracao);

        subtracao = calculadora.subtracao(40, 20);
        Assertions.assertEquals(20, subtracao);

        subtracao = calculadora.subtracao(29.6, 13.7);
        Assertions.assertEquals(15.90, subtracao);
    }

    @Test
    void multiplicacaoComSucesso(){
        double multiplicacao = calculadora.multiplicacao(10, 5);
        Assertions.assertEquals(50, multiplicacao);

        multiplicacao = calculadora.multiplicacao(3, 2.6);
        Assertions.assertEquals(7.8, multiplicacao);

        multiplicacao = calculadora.multiplicacao(7, 0);
        Assertions.assertEquals(0.00, multiplicacao);
    }

    @Test
    void divisaoComSucesso(){
        double divisao = calculadora.divisao(10, 5);
        Assertions.assertEquals(2, divisao);

        divisao = calculadora.divisao(16, 0);
        Assertions.assertEquals(0.00, divisao);

        divisao = calculadora.divisao(7, 2);
        Assertions.assertEquals(3.50, divisao);
    }

    @Test
    void raizQuadradaComSucesso(){
        double raizQuadrada = calculadora.raizQuadrada(0);
        Assertions.assertEquals(0.00, raizQuadrada);

        raizQuadrada = calculadora.raizQuadrada(-4);
        Assertions.assertEquals(0.00, raizQuadrada);

        raizQuadrada = calculadora.raizQuadrada(25);
        Assertions.assertEquals(5, raizQuadrada);
    }

    @Test
    void potenciaComSucesso(){
        double potencia = calculadora.potencia(4,0);
        Assertions.assertEquals(1, potencia);

        potencia = calculadora.potencia(10,1);
        Assertions.assertEquals(10, potencia);

        potencia = calculadora.potencia(3, 2);
        Assertions.assertEquals(9, potencia);

        potencia = calculadora.potencia(-4, 2);
        Assertions.assertEquals(16, potencia);

        potencia = calculadora.potencia(4, -2);
        Assertions.assertEquals(0.06, potencia);
    }
}
