public class ConversorTemperatura {
    // Converte Fahrenheit para Celsius
    public static double fahrenheitParaCelsius( fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit( celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
