package Revisao;

public class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double farhrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Testando a conversão de Celsius para Fahrenheit
        double celsius = 25.0;
        double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");

        // Testando a conversão de Fahrenheit para Celsius
        fahrenheit = 77.0;
        celsius = ConversorTemperatura.farhrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");

    }


}
