package AtvLivroBiblioteca05_09_2024.Domineo;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livros> livros = new ArrayList<>();

    public Biblioteca(ArrayList<Livros> livros) {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livros livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo()) ;
    }

    public void removerLivro(String titulo) {
        boolean livroRemovido = false;
        for (int i = 0; i < livros.size(); i++) {
            Livros livro = livros.get(i);
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                livroRemovido = true;
                System.out.println("Livro removido: " + livro.getTitulo());
                break;
            }
        }
        if (!livroRemovido) {
            System.out.println("Livro com o título '" + titulo + "' não encontrado.");
        }


        }
    @Override
    public String toString() {
        String result = "Biblioteca:\n";
        for (Livros livro : livros) {
            result += livro.getTitulo() + "\n";
        }
        return result;

    }




}
