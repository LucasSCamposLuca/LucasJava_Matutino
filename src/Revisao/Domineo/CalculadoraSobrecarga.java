package Revisao.Domineo;

public class CalculadoraSobrecarga {
    double a;
    double b;


    //Soma

    public int Soma(int a, int b){
        return a + b;
    }

    public int Soma(int a, int b, int c){
        return a + b + c;
    }

    public double Soma( double a, double b){
        return  a + b ;
    }
    //Subtração

    public int Sub(int a , int b){
        return  a - b;
    }

    public  int Sub(int a , int b , int c){
        return  a - b - c;
    }

    public double Sub(double a , double b){
        return  a - b;
    }

    //Multiplicação

    public int Multiplicacao(int a , int b){
        return  a * b;
    }

    public int Multiplicacao(int a, int b, int c){
        return a * b * c;
    }

    public double Multiplicacao(double a, double b , double c){
        return  a * b * c;
    }

    //Div

    public int Divisao(int a, int b){
        return a / b;
    }


    public  int Divisao(int a , int b , int c){
        return  a / b / c;
    }

    public double Divisao(double a , double b){
        return  a / b;
    }


}
