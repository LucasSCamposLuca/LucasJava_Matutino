package AtividadeArrayList04_09_2024;

import java.util.ArrayList;
import java.util.Collections;

public class Colections3 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Keven");
        nomes.add("Debora");
        nomes.add("Ana");
        nomes.add("Kaio");

        Collections.sort(nomes);

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}
