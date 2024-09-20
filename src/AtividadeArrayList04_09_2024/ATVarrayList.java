package AtividadeArrayList04_09_2024;

import java.util.ArrayList;

public class ATVarrayList {
    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList<>();

        Lista.add("Batman");
        Lista.add("Flash");
        Lista.add("Eternos");
        Lista.add("Paixão de Cristo");
        Lista.add("Constantine");
        System.out.println(Lista);

        Lista.remove(2);
        System.out.println(Lista);

    }
}
