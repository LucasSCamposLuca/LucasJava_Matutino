package AtividadeContrutores03_09_2024;
import AtividadeContrutores03_09_2024.Domineo.Biblioteca;
import AtividadeContrutores03_09_2024.Domineo.Carros;
import AtividadeContrutores03_09_2024.Domineo.Livros;

import java.util.ArrayList;

public class mainLivro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(new ArrayList<Livros>());
        Livros livro = new Livros("Carros", "Ruhan", "20/06/2023");
        System.out.println("--------------------------Classe Livro------------------------");
        livro.Imprimir();
        System.out.println("------------------------------------------------");
        System.out.println("---------------------------Classe biblioteca------------------------");
        biblioteca.adicionarLivro(livro);

        System.out.println("-----------------Remover livro------------------------------");
        biblioteca.removerLivro("Carros");
    }
}
