package Revisao.Domineo;

public class Produto {
    private double preco;
    private String nome;

    public Produto(){
        this.nome = "Lucas";
        this.preco = 3562.25;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

}
