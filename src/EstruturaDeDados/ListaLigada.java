package EstruturaDeDados;

public class ListaLigada {
    private Elemento primero;
    private Elemento utimo;
    private int tamanho;



    public ListaLigada(){
        this.tamanho = 0;
    }

    public Elemento getPrimero() {
        return primero;
    }

    public void setPrimero(Elemento primero) {
        this.primero = primero;
    }

    public Elemento getUtimo() {
        return utimo;
    }

    public void setUtimo(Elemento utimo) {
        this.utimo = utimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    public void adcionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if (this.primero == null && this.utimo == null) {
            this.primero = novoElemento;
            this.utimo = novoElemento;
        } else {
            this.utimo.setProximo(novoElemento);
            this.utimo = novoElemento;
        }
        this.tamanho++;
    }


    public void remover(String novoProcurado){
          Elemento anterior = null;
          Elemento atual = this.primero;
          for (int i = 0 ; i < this.getTamanho(); i++){
              if(atual.getValor() . equalsIgnoreCase(novoProcurado)){
                  if (atual == primero){
                      this.primero = atual.getProximo();
                      atual.setProximo(null);


                  }else{
                      anterior.setProximo(atual.getProximo());
                      atual = null;
                  }
                  anterior.setProximo(atual.getProximo());
                  atual = null;
                  this.tamanho--;
                  break;
              }
              anterior = atual;
              atual = atual.getProximo();
          }
    }

    public Elemento get(int posicao){
        Elemento atual = this.primero;
        for ( int i = 0 ; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }


}
