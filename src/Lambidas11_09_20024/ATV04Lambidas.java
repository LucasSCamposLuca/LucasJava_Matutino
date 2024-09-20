package Lambidas11_09_20024;

import java.util.Arrays;
import java.util.List;

public class ATV04Lambidas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda", "Alfredo", "Pedro", "Astolfo");

        long count = palavras.stream()
                .filter(palavra -> palavra.startsWith("A"))
                .count();

        System.out.println("Número de palavras que começam com A: " + count);
    }
}
