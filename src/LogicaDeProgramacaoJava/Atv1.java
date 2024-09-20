package LogicaDeProgramacaoJava;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela
        // a soma entre A e B é mostre se a soma é menor que C.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A");
        int a = scanner.nextInt();

        System.out.println("Digite B");
        int b = scanner.nextInt();

        System.out.println("Digite C");
        int c = scanner.nextInt();

        int soma = a + b;

        if(soma > c){
            System.out.println("C é maior que A e B");
        } else{
            System.out.println("A e B é maior que C");
        }

    }
}
