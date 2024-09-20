package AtividadeContrutores03_09_2024.Domineo;

public class Retangulo {

//    Crie uma classe chamada retângulo, que possui os seguintes atributos:
////    Largura
////    Altura
////    Construtores: que inicialize largura e altura
////    Um construtor que não recebe argumentos e inicializa a largura e a altura com
//      valores padrão de ‘1.0’;
////    CalcularAreadoRetangulo()
////    CalcularPerimetro();

    double largura;
    double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(){
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura( double altura){
        this.altura = altura;
    }

    //retangulo
    // Perímetro = 2 * (altura + largura);
    // área=largura×comprimento

    public void CalcularAreadoRetangulo(){
        double areaDoRetnagulo = getAltura() * getLargura();
        System.out.println("A área do retângulo é : " + areaDoRetnagulo);
    }

    public void CalcularPerimetro(){
        double PerimetroRetangulo = 2 * (getAltura() + getLargura());
        System.out.println("O perímetro do retaângulo é : " + PerimetroRetangulo);
    }

    public void Imprimir(){
        System.out.println("A altura do : " + getAltura());
        System.out.println("A largura do retângulo: " + getLargura());
    }


}
