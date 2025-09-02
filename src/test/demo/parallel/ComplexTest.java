package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {

    @Test
    void testCube() {

        Complex number1 = new Complex(2, 0);
        Complex result1 = number1.cube();

        assertEquals(8.0, result1.getRe(), 0.00001, "Real part for (2)³ is incorrect");
        assertEquals(0.0, result1.getIm(), 0.00001, "Imaginary part for (2)³ is incorrect");

        Complex number2 = new Complex(1, 1);
        Complex result2 = number2.cube();

        assertEquals(-2.0, result2.getRe(), 0.00001, "Real part for (1+i)³ is incorrect");
        assertEquals(2.0, result2.getIm(), 0.00001, "Imaginary part for (1+i)³ is incorrect");
    }

    @Test
    void testSin() {

        Complex number1 = new Complex(0, 0);
        Complex result1 = number1.sin();

        assertEquals(0.0, result1.getRe(), 0.00001, "Real part for sin(0) is incorrect");
        assertEquals(0.0, result1.getIm(), 0.00001, "Imaginary part for sin(0) is incorrect");

        Complex number2 = new Complex(Math.PI / 2, 0);
        Complex result2 = number2.sin();

        assertEquals(1.0, result2.getRe(), 0.00001, "Real part for sin(PI/2) is incorrect");
        assertEquals(0.0, result2.getIm(), 0.00001, "Imaginary part for sin(PI/2) is incorrect");
    }
}