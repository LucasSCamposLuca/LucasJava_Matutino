package LogicaDeProgramacaoJava;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
       // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//        caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//        imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        if (a == b){
            int soma = a + b;
            System.out.println("A soma é: " + soma);
            int c = soma;
            System.out.println("C recebe : " + c);
        } else {
            int mult = a * b;
            System.out.println("A multiplicação é: " + mult);
            int c = mult;
            System.out.println("C recebe : " + c);
        }
    }
}
