package AtividadeContrutores03_09_2024.Domineo;

public class Livros {
//    Crie uma classe Livro com os seguintes atributos, String titulo, String autor,
//    String ano publicação
//► A classe deve ter um construtor métodos get and set
//► Criar uma classe biblioteca que tem: arrayslist<livros> livros para armazenar a
//    lista de livros
//    Possui um construtor para Arraylist
//► Contendo os métodos adicionar, remover e listar
//► E crie a classe main para instalar e fazer os métodos adicionar, remover e
//    listar.

    public String titulo;
    public String autor;
    public String publicacao;

    public Livros(String titulo, String autor, String publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getPublicacao(){
        return publicacao;
    }

    public void setPublicacao(String publicacao){
        this.publicacao = publicacao;
    }

    public void Imprimir(){
        System.out.println("Título: "+getTitulo());
        System.out.println("Autor :" +getAutor());
        System.out.println("Ano de publicação: "+getPublicacao());
    }


}
