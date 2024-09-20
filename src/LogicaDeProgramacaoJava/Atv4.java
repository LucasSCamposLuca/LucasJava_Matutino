package LogicaDeProgramacaoJava;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

        System.out.println("Digite um valor");
        int valor = scanner.nextInt();

        int sucessor = valor + 1;
        int antecessor = valor - 1;

        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor: "+ antecessor);
    }
}
