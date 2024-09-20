package AtividadeArrayList04_09_2024;
import java.util.ArrayList;
import java.util.Scanner;

public class Colections2 {
    public static void main(String[] args) {
//        import java.util.HashSet; HashSet<Integer> conjunto = new HashSet<>();
//        conjunto.add(10); conjunto.add(20); conjunto.add(30); for (int numero :
//                conjunto) { System.out.println(numero); }


        //ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();


        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        int numeroVerificar = 11;

        if(numeros.contains(numeroVerificar)){
            System.out.println("O número foi encontrado: " + numeroVerificar);
        } else {
            System.out.println("Número não encontrado: " + numeroVerificar);
        }




    }
}
