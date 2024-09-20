package Revisao;

import Revisao.Domineo.CalculadoraSobrecarga;

public class sobreCargaMetodosTest {
    public static void main(String[] args) {
        CalculadoraSobrecarga sobrecargaMetodos = new CalculadoraSobrecarga();
        // Soma
        System.out.println("Soma");
        System.out.println(sobrecargaMetodos.Soma(2,4));
        System.out.println(sobrecargaMetodos.Soma(1, 2, 3));
        System.out.println(sobrecargaMetodos.Soma(2.4,4.8));
        System.out.println("--------------------------------------------");
        // Sub
        System.out.println("Sub");
        System.out.println(sobrecargaMetodos.Sub(2,4));
        System.out.println(sobrecargaMetodos.Sub(200, 9 ,20));
        System.out.println(sobrecargaMetodos.Sub(15, 2, 4));
        System.out.println("--------------------------------------------");
        // Mult
        System.out.println("Mult");
        System.out.println(sobrecargaMetodos.Multiplicacao(2,4));
        System.out.println(sobrecargaMetodos.Multiplicacao(8,6,1));
        System.out.println(sobrecargaMetodos.Multiplicacao(4,5,6));

        //
        System.out.println("--------------------------------------------");
        System.out.println("Div");
        System.out.println(sobrecargaMetodos.Divisao(5,6));
        System.out.println(sobrecargaMetodos.Divisao(4.5,9.3));
        System.out.println(sobrecargaMetodos.Divisao(200,1,4));
    }

}
