package Revisao;

import Revisao.Domineo.Pessoa;
import Revisao.Domineo.PessoaSobrecarregado;

public class PessoaSobrecarregadoTeste {
    public static void main(String[] args) {
        PessoaSobrecarregado pessoa1 = new PessoaSobrecarregado();
        PessoaSobrecarregado pessoa2 = new PessoaSobrecarregado("LuskãoDoJava", 20, "Tech Lid");
        PessoaSobrecarregado pessoa3 = new PessoaSobrecarregado("Luskão Tomate");
        System.out.println("Contrutor Vazio");
        pessoa1.DadosPessoaSobrecarregado();
        System.out.println("------------------------------------");
        System.out.println("Contrutor com parâmetros");
        pessoa2.DadosPessoaSobrecarregado();
        System.out.println("------------------------------------");
        System.out.println("Contrutor com nome");
        pessoa3.DadosPessoaSobrecarregado();
    }
}
