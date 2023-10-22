package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList(
                "Maçã",
                "Laranja",
                "Banana",
                "Morango",
                "Abacaxi",
                "Uva",
                "Limão",
                "Pera",
                "Melancia",
                "Mamão",
                "Maçã",
                "Maçã",
                "Banana",
                "Uva",
                "Morango",
                "Morango",
                "Abacaxi"
        );

        // número total de strings na lista
        System.out.println("O número total de strings na lista é " + frutas.stream().count());

        // string mais longa da lista
        String stringMaisLonga = frutas.stream()
                .max((fruta1, fruta2) -> fruta1.length() - fruta2.length()).get();
        System.out.println("A string mais longa da lista é '" + stringMaisLonga + "'");

        // contando as ocorrencias de cada string e inserindo em um Map para que não haja string repetida
        Map<String, Long> ocorrenciasDeString = frutas.stream()
                .collect(Collectors.groupingBy(fruta -> fruta, Collectors.counting()));

        // imprimindo as 5 string mais ocorrentes da lista
        System.out.println("A 5 string mais ocorrentes da lista são:");
        ocorrenciasDeString.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(fruta -> System.out.println(fruta.getKey() + " : " + fruta.getValue()));
    }
}