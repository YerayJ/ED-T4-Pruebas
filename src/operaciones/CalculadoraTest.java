package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    Calculadora calc = new Calculadora(20,10);

    @Test
    void testSuma() {
        int result = calc.suma();
        assertEquals(30,result);
    }

    @Test
    void testResta() {
        Calculadora calc = new Calculadora(20,10);
        int result = calc.resta();
        assertEquals(10,result);
    }

    @Test
    void testResta_2() {
        Calculadora calc = new Calculadora(10,15);
        int result = calc.resta();
        assertEquals(5,result);
    }

    @Test
    void testResta2_1() {
        boolean result = calc.resta2();
        assertTrue(result);
    }

    @Test
    void testResta2_2() {
        Calculadora calc = new Calculadora(10,20);
        boolean result = calc.resta2();
        assertFalse(result);
    }

    @Test
    void testMultiplica() {
        int result = calc.multiplica();
        assertEquals(200,result);
    }

    @Test
    void testDivide() {
        int result = calc.divide();
        assertEquals(2,result);
    }

    @Test
    void testDivide2_1() {
        Calculadora calc = new Calculadora(10,0);
        Integer result = calc.divide2();
        assertNull(result, "El num2 no es 0");
    }

    @Test
    void testDivide2_2() {
        Integer result = calc.divide2();
        assertEquals(2,result, "El num2 no es divisible");
    }

}
