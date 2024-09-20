package Lambidas11_09_20024;

import java.util.Arrays;
import java.util.List;

public class ATV03LAmbidas {
    public static void main(String[] args) {
        List<String> conctStrings = Arrays.asList("Lua", "Sol", "Estrlas", "Constelações", "Sargitários A", "Pilares da Criação");

        String concatenarNomes = conctStrings.stream()
                .reduce((a, b) -> a + ", " + b)
                .orElse("Lista vazia");

        System.out.println(concatenarNomes);


    }
}
