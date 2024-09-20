package Lambidas11_09_20024;

import java.util.Arrays;
import java.util.List;

public class ATV01Lambidas {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Uva", "Maça", "Pera", "Morango", "Abacaxi", "Tomate");

        list.stream()
                .filter(l -> l.length() == 4)
                .forEach(System.out::println);
    }
}
