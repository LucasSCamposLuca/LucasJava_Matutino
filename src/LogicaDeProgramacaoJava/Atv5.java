package LogicaDeProgramacaoJava;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        // calcule quantos salários mínimos esse
        //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
        Scanner scanner = new Scanner(System.in);

        double SalarioMin = 1293.30;

        System.out.println("Digite seu salário");
        double MeuSalario = scanner.nextDouble();

        double  calculoSaMin = MeuSalario / SalarioMin;
        System.out.println("Você tem : "+ calculoSaMin + "Salários Minimos");

    }
}
