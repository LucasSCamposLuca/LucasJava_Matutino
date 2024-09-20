package EstruturaDeDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //VOTORES

        int [] numeros = new int [9];
        //Exibir quntidade de vetores
        System.out.println(numeros.length);
        //Atribui valor a um vetor
        numeros[0] = 20;
        numeros[1] = 41;
        numeros[8] = 80;
        numeros[6] = 37;
        //Exibe a referência do vetor
        System.out.println(numeros);
        //vetor manual
        System.out.println(numeros[4]);
        System.out.println(numeros[3]);
        System.out.println(numeros[8]);
        System.out.println("------------------------------------------");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Estados");
        String [] estados = new String[7];

        estados[0] = "DF";
        estados[1] = "AM";
        estados[2] = "CE";
        estados[3] = "SC";
        estados[4] = "PE";
        estados[5] = "GO";
        estados[6] = "RO";

        for (int i = 0; i < estados.length; i++ ){
            System.out.println(estados[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a UF o estado para verificar se foi regidtrado");
        String busca = scanner.next();

        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++ ){
            String elementos = estados[i];
            if ( elementos.equalsIgnoreCase(busca)){
                System.out.println("Estado encontrado");
                encontrou = true;
                break;
            }
        }

        if (encontrou == true){
            System.out.println("Encontrou");
        } else {
            System.out.println("Não encontrou");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Lista Dinâmica || Lista ligada");



    }
}
