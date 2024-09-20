package Revisao;

import java.util.Arrays;
import java.util.List;

class MapStreamAPI {
    private String nome;
    private double preco;

    public MapStreamAPI(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

public class Main {
    public static void main(String[] args) {
        // Lista de produtos
        List<MapStreamAPI> produtos = Arrays.asList(
                new MapStreamAPI("Produto A", 50.0),
                new MapStreamAPI("Produto B", 30.0),
                new MapStreamAPI("Produto C", 70.0),
                new MapStreamAPI("Produto D", 20.0)
        );

        double valorLimite = 40.0; // Preço limite

        // Usando Stream API para filtrar e extrair nomes
        produtos.stream()
                .filter(produto -> produto.getPreco() > valorLimite) // Filtra produtos com preço superior a valorLimite
                .map(MapStreamAPI::getNome) // Extrai os nomes dos produtos
                .forEach(System.out::println); // Exibe os nomes
    }
}

