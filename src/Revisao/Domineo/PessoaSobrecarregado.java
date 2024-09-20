package Revisao.Domineo;

public class PessoaSobrecarregado {
    String nome;
    int idade;
    String profissao;

    public PessoaSobrecarregado(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public PessoaSobrecarregado(){
        String nome = "Luskão";
        int idade = 24;
        String profissao = "Java Senior back-end";
    }

    public PessoaSobrecarregado(String nome ){
        this.nome = nome;
    }


    public void DadosPessoaSobrecarregado(){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Profissão : "+ profissao);
    }
}
