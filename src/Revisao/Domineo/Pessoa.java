package Revisao.Domineo;

public class Pessoa {
    String nome;
    int idade;
    String profissao;

    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void DadosPessoa(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Profissão : "+ profissao);
    }
}