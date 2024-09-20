package EstruturaDeDados;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adcionar("AC");
        lista.adcionar("DF");
        lista.adcionar("AL");
        lista.adcionar("PE");
        lista.adcionar("RO");
        lista.adcionar("CE");
        System.out.println("Tamanho :" +lista.getTamanho());
        System.out.println("Primeiero:  "+ lista.getPrimero().getValor());
        System.out.println("Ultimo:  "+ lista.getUtimo().getValor());

        for (int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Remover Estado");
        //remover estado CE
        lista.remover("DF");
        lista.adcionar("SP");
        System.out.println("Estado SP adcionado!");
        System.out.println("Removeu estado AC");

        for (int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

    }
}
