package Revisao;

import java.util.Arrays;
import java.util.List;

    public class ReduceAPI {
        public static void main(String[] args) {
            // Lista de inteiros
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

            // Usando reduce() para calcular a soma
            int soma = numeros.stream()
                    .reduce(0, Integer::sum); // Inicializa com 0 e usa a soma como operação de redução

            // Exibindo o resultado
            System.out.println("A soma de todos os números é: " + soma);
        }
    }

