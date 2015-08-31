
import org.aplie.android.robolectictest.Calculadora;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    // @Test => Anotación que especifica que es un test ejecutable
    // Test que comprueba el metodo de sumar
    @Test
    public void validateSumaMethod() {
        int valor1 = 5;
        int valor2 = 3;
        String expectedResult = "8";

        String result = calculadora.suma(valor1, valor2);

        assertEquals("The method Suma return incorrect result",expectedResult,result);
    }

    // Test que comprueba el metodo de resta
    @Test
    public void validateRestaMethod() {
        int valor1 = 5;
        int valor2 = 3;
        String expectedResult = "2";

        String result = calculadora.resta(valor1, valor2);

        assertEquals("The method Resta return incorrect result",expectedResult,result);
    }

    // Test que comprueba el metodo de multiplicar
    @Test
    public void validateMutiplicarMethod() {
        int valor1 = 5;
        int valor2 = 3;
        String expectedResult = "15";

        String result = calculadora.multiplicar(valor1, valor2);

        assertEquals("The method Multiplicar return incorrect result",expectedResult,result);
    }

    // Test que comprueba el metodo de dividir
    @Test
    public void validateDividirMethod() {
        int valor1 = 6;
        int valor2 = 2;
        String expectedResult = "3";

        String result = calculadora.dividir(valor1, valor2);
        String resutlZeroDivide = calculadora.dividir(valor1,0);

        assertEquals("The method dividir return incorrect result",expectedResult,result);
        assertEquals("The method dividir return incorrect result","No se puede dividir entre 0",resutlZeroDivide);
    }
}
