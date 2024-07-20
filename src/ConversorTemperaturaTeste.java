import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversorTemperaturaTeste {
    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0, ConversorTemperatura.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, ConversorTemperatura.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32, ConversorTemperatura.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212, ConversorTemperatura.celsiusParaFahrenheit(100), 0.001);
    }
}
