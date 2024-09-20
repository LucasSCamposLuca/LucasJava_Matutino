package AtividadeArrayList04_09_2024;
import java.util.ArrayList;

public class Colections1 {
    public static void main(String[] args) {
//        import java.util.ArrayList; ArrayList<String> lista = new ArrayList<>();
//        lista.add("Gabriel"); lista.add("Ana"); lista.add("João"); for (String nome :
//                lista) { System.out.println(nome); }

        ArrayList <String> lista = new ArrayList<>();

        lista.add("Gabriel");
        lista.add("Ana");
        lista.add("João");
        lista.add("Karlos");
        lista.add("Cachorro Louco");
        System.out.println(lista);

        System.out.println("---------------------------------");

        lista.remove(3);

        for (String nome : lista){
            System.out.println(nome);
        }

    }
}
