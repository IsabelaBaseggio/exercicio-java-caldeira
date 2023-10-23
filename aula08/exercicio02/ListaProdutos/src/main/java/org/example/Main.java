package org.example;

import org.example.Produto.Produto;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Camiseta", 29.99, 50),
                new Produto("Calça Jeans", 59.99, 30),
                new Produto("Sapato", 99.99, 20),
                new Produto("Jaqueta", 79.99, 9),
                new Produto("Meias", 9.99, 100),
                new Produto("Chapéu", 39.99, 5),
                new Produto("Shorts", 49.99, 40)
        );

        // encontrando o produto mais caro da lista
        Produto produtoMaisCaro = produtos.stream()
                .max(Comparator.comparing((Produto::getPreco)))
                .orElse(null);

        if(produtoMaisCaro != null){
            System.out.println("O produto mais caro é " + produtoMaisCaro.getNome() + " e seu preço é R$" + produtoMaisCaro.getPreco() + "\n");
        } else {
            System.out.println("Não há nenhum produto na lista \n");
        }

        // somando todos os produtos da lista
        double precoTotal = produtos.stream()
                .map(produto -> produto.getPreco() * produto.getQuantidade()) // multiplicando o valor do produto pela quantidade adicionando em um map
                .reduce(0.0, (subtotal, valorProdutoPorQuantidade) -> subtotal + valorProdutoPorQuantidade); // somando todos os valores do map

        System.out.println("O preço total de todos os produtos da lista é R$" + precoTotal + "\n");

        // criando nova lista com produtos com quantidade maior que 10
        List<Produto> produtosQuantidadeAcimaDeDez = produtos.stream()
                .filter(produto -> produto.getQuantidade() > 10) // filtrando os produtos com quantidade maior que 10
                .collect(Collectors.toList()); // adicionando o produto com quantidade maior que 10 em uma nova lista

        System.out.println("Produtos com quantidade maior que 10");
        produtosQuantidadeAcimaDeDez.forEach(produto -> System.out.println(produto.getNome() + ": R$" + produto.getPreco() + " - Quantidade: " + produto.getQuantidade()));
    }
}