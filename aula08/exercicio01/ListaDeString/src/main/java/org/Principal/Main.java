package org.Principal;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Morango");
        lista.add("Mamão");
        lista.add("Melão");
        lista.add("Melancia");
        lista.add("Laranja");
        lista.add("Kiwi");
        lista.add("Maçã");
        lista.add("Maçã");
        lista.add("Maçã");
        lista.add("Maçã");
        lista.add("Laranja");
        lista.add("Laranja");
        lista.add("Morango");

        System.out.println("O número total de strings na lista é " + lista.stream().count());

        System.out.println("A string mais longa da lista é " + lista.stream().max(Comparator.comparing(String::length)).get());

        // Quantidade de vezes que as strings repetem
        Map<Object, Long> quantidadeRepeticoesStrings = lista.stream()
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        // Ordenando as strings das mais frequentes para menos frequentes e separando as 5 mais frequentes.
        Map<Object, Long> cincoStringsMaisFrequentes = quantidadeRepeticoesStrings.entrySet().stream()
                .sorted(Map.Entry.<Object, Long>comparingByValue().reversed())
                .limit(5).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("As 5 string mais frequentes são: ");
        cincoStringsMaisFrequentes.forEach((string, vezes) -> {
            System.out.println("String: " + string + " - Vezes: " + vezes);
        });
    }
}