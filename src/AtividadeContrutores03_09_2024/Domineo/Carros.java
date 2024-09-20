package AtividadeContrutores03_09_2024.Domineo;

public class Carros {
    String modelo;
    int ano;
    String marca;

    public Carros(String modelo, int ano, String marca){
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo () {
        return modelo;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }

}
