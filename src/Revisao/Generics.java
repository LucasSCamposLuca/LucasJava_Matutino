package Revisao;

public class Generics {

    static class Caixa<T> {
        private T objeto;


        public void inserir(T objeto) {
            this.objeto = objeto;
        }


        public T retirar() {
            return objeto;
        }
    }


        public static void main(String[] args) {

            Caixa<Integer> caixaInteger = new Caixa<>();
            caixaInteger.inserir(42);
            System.out.println("Valor na Caixa<Integer>: " + caixaInteger.retirar());


            Caixa<String> caixaString = new Caixa<>();
            caixaString.inserir("Olá, Generics!");
            System.out.println("Valor na Caixa<String>: " + caixaString.retirar());


            Caixa<Double> caixaDouble = new Caixa<>();
            caixaDouble.inserir(3.14);
            System.out.println("Valor na Caixa<Double>: " + caixaDouble.retirar());
        }


}
