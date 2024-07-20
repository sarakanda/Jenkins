public class ConversorTemperaturaTeste {
    public static void main(String[] args) {
        testeFahrenheitParaCelsius();
        testeCelsiusParaFahrenheit();
    }

    public static void testeFahrenheitParaCelsius() {
        double result = ConversorTemperatura.fahrenheitParaCelsius(32);
        System.out.println("32°F to Celsius: " + result); // Esperado: 0.0

        result = ConversorTemperatura.fahrenheitParaCelsius(212);
        System.out.println("212°F to Celsius: " + result); // Esperado: 100.0
    }

    public static void testeCelsiusParaFahrenheit() {
        double result = ConversorTemperatura.celsiusParaFahrenheit(0);
        System.out.println("0°C to Fahrenheit: " + result); // Esperado: 32.0

        result = ConversorTemperatura.celsiusParaFahrenheit(100);
        System.out.println("100°C to Fahrenheit: " + result // Esperado: 212.0
    
}
