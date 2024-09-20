package LogicaDeProgramacaoJava;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        //2 - Faça um algoritmo para receber um número qualquer e
        // imprimir na tela se o número é par ou ímpar, positivo ou negativo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int valor = scanner.nextInt();

        if( valor %2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        if ( valor > 0 ){
            System.out.println("O valor é positivo");
        } else {
            System.out.println("O valor é negativo");
        }

    }
}
