package Revisao.Domineo;

public class Veiculo {

        private String marca;
        private String modelo;
        private int ano;

        public Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public String info() {
            return ano + " " + marca + " " + modelo;
        }

        public void acelerar() {
        System.out.println("O veículo está acelerando.");
        }
    }

    // Subclasse Carro
    class Carro extends Veiculo {
        private int numPortas;

        public Carro(String marca, String modelo, int ano, int numPortas) {
            super(marca, modelo, ano);
            this.numPortas = numPortas;
        }

        @Override
        public void acelerar() {
            System.out.println("A carro " + super.info() + " está acelerando velozmente.");
        }

    }

    // Subclasse Moto
    class Moto extends Veiculo {
        private String tipo; // Ex: esportiva, cruiser

        public Moto(String marca, String modelo, int ano, String tipo) {
            super(marca, modelo, ano);
            this.tipo = tipo;
        }

        @Override
        public void acelerar() {
            System.out.println("A moto " + super.info() + " está acelerando velozmente.");
        }

    }

    // Classe principal para testar
    class Main {
        public static void main(String[] args) {
            Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
            Moto moto = new Moto("Honda", "CBR", 2022, "esportiva");

            System.out.println(carro.info());
            carro.acelerar();
            System.out.println(moto.info());
            moto.acelerar();
        }
    }


