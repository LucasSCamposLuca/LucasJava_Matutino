package Revisao.Domineo;

public class Calculadora {
    double a;
    double b;

    public Calculadora(double A, double B){
        this.a = A;
        this.b = B;
    }

    public void Soma(){
        double reultadoSoma = a + b ;
        System.out.println("A soma é: " + reultadoSoma);
    }

    public void Subtriair(){
        double reultadoSub = a - b ;
        System.out.println("A subração é: " + reultadoSub);
    }

    public void Multiplicacao(){
        double reultadoMultiplicacao = a * b ;
        System.out.println("A multiplicacao é: " + reultadoMultiplicacao);
    }

    public void Divisao(){
        double reultadoDivisao = a / b ;
        System.out.println("A divisao é: " + reultadoDivisao);
    }

}
