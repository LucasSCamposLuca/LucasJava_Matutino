package Lambidas11_09_20024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ATV02Lambidas {
    //Dada uma lista de números inteiros, use uma expressão lambda para filtrar
    //    apenas os números pares e, em seguida, use o método
    //    reduce para calcular a soma desses números.
    public static void main(String[] args) {
        List<Integer>numb = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer>listaNums = numb.stream().filter(listaNum1 -> listaNum1 % 2 == 0).collect(Collectors.toList());
        System.out.println(listaNums);

       int sum =  numb.stream()
                .filter(l -> l % 2 == 0)
                .reduce( 0,(a, b)  -> a + b);
        System.out.println("Soma: " + sum);
        
    }
}
