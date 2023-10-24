package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class OperacaoNumeroTest {

    public OperacaoNumero operacaoNumero = new OperacaoNumero();

    // Método 1: Calcular a soma de uma lista de números inteiros
    @Test
    void somarNumeros_SemElementos() {
        int[] numeros = {};
        int resultadoEsperado = 0;
        Assertions.assertEquals(resultadoEsperado, operacaoNumero.somarNumeros(numeros));
    }

    @Test
    void somarNumeros_ComElementosPositivos() {
        int[] numeros = {1, 1, 2, 3, 5, 8};
        int resultadoEsperado = 1 + 1 + 2 + 3 + 5 + 8; // 20
        Assertions.assertEquals(resultadoEsperado, operacaoNumero.somarNumeros(numeros));
    }

    @Test
    void somarNumeros_ComElementosNegativos() {
        int[] numeros = {-1, -1, -2, -3, -5, -8};
        int resultadoEsperado = -1 - 1 - 2 - 3 - 5 - 8; // -20
        Assertions.assertEquals(resultadoEsperado, operacaoNumero.somarNumeros(numeros));
    }

    @Test
    void somarNumeros_ComElementosPositivosENegativos() {
        int[] numeros = {-1, 1, -2, 3, -5, 8};
        int resultadoEsperado = -1 + 1 - 2 + 3 - 5 + 8; // 4
        Assertions.assertEquals(resultadoEsperado, operacaoNumero.somarNumeros(numeros));
    }

    // Método 2: Verificar se um número é par
    @Test
    void ehPar_ComParPositivo() {
        Assertions.assertTrue(operacaoNumero.ehPar(2));
    }

    @Test
    void ehPar_ComImparPositivo() {
        Assertions.assertFalse(operacaoNumero.ehPar(3));
    }

    @Test
    void ehPar_ComZero() {
        Assertions.assertTrue(operacaoNumero.ehPar(0));
    }

    @Test
    void testEhPar_ComParNegativo() {
        Assertions.assertTrue(operacaoNumero.ehPar(-4));
    }

    @Test
    void ehPar_ComImparNegativo() {
        Assertions.assertFalse(operacaoNumero.ehPar(-5));
    }

    // Método 3: Calcular o fatorial de um número inteiro positivo
    @Test
    public void calcularFatorial_NumeroZero() {
        int numeroZero = 0;
        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(numeroZero));
    }

    @Test
    public void calcularFatorial_NumeroUm() {
        int numeroUm = 1;
        Assertions.assertEquals(1, operacaoNumero.calcularFatorial(numeroUm));
    }

    @Test
    public void calcularFatorial_NumeroPositivo() {
        int numeroPositivo = 7;
        Assertions.assertEquals(5040, operacaoNumero.calcularFatorial(numeroPositivo));
    }

    @Test
    public void calcularFatorial_NumeroNegativo() {
        int numeroNegativo = -3;
        Assertions.assertThrows(IllegalArgumentException.class, () -> operacaoNumero.calcularFatorial(numeroNegativo));
    }

    // Método 4: Verificar se uma string é um palíndromo (lê-se igual de trás para frente)
    @Test
    public void ehPalindromo_Palindromo() {
        String palindromo = "A torre da derrota";
        Assertions.assertTrue(operacaoNumero.ehPalindromo(palindromo));
    }

    @Test
    public void ehPalindromo_NaoPalindromo() {
        String naoPalindromo = "Não é Palindromo";
        Assertions.assertFalse(operacaoNumero.ehPalindromo(naoPalindromo));
    }

    @Test
    public void ehPalindromo_PalindromoVazio() {
        String palindromoVazio = "";
        Assertions.assertTrue(operacaoNumero.ehPalindromo(palindromoVazio));
    }

    @Test
    public void ehPalindromo_CaracteresEspeciais() {
        String palindromoComEspeciais = "Eva, asse essa ave!";
        Assertions.assertTrue(operacaoNumero.ehPalindromo(palindromoComEspeciais));
    }

    // Método 5: Calcular o n-ésimo termo da sequência de Fibonacci
    @Test
    public void calcularFibonacci_IndiceZero() {
        int indiceZero = 0;
        Assertions.assertEquals(0, operacaoNumero.calcularFibonacci(indiceZero));
    }

    @Test
    public void calcularFibonacci_IndiceUm() {
        int indiceUm = 1;
        Assertions.assertEquals(1, operacaoNumero.calcularFibonacci(indiceUm));
    }

    @Test
    public void calcularFibonacci_IndicePequeno() {
        int indicePequeno = 5;
        Assertions.assertEquals(5, operacaoNumero.calcularFibonacci(indicePequeno));
    }

    @Test
    public void calcularFibonacci_IndiceGrande() {
        int indicePequeno = 20;
        Assertions.assertEquals(6765, operacaoNumero.calcularFibonacci(indicePequeno));
    }

    @Test
    public void calcularFibonacci_IndiceNegativo() {
        int indiceNegativo = -3;
        Assertions.assertThrows(IllegalArgumentException.class, () -> operacaoNumero.calcularFibonacci(indiceNegativo));
    }
}
