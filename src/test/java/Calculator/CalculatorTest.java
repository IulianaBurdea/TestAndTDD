package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Calculator.Calculator;
/*
Creează clasa Calculator și implementează operațiile: adunare, scădere, înmulțire, împărțire.
 Apoi, creează clasa CalculatorTest cu teste pentru operațiile de mai sus.
 */
/*
TDD:
1. scriem testul care pica
2. scriem implementarea care trece testul
3. refactorizam
 */
/*
user story:
tichet in Jira de tipul Story care sa va indice Business Level ce trebuie sa refaca functionalitatea
-Who?
-What?
-Why?
As a user of digital scientific calculator, I want to be able to addition
 */
public class CalculatorTest {
    private final Calculator calculatorUT = new Calculator();

    //teste unitare-> testam metode
    //SOT -> test unitar ,source of truth
    @Test
    public void testAdunare() {
        assertEquals(5.0, calculatorUT.add(2, 3)); //teste unitare 5=2+3
        assertEquals(-1.0, calculatorUT.add(1, -2));

    }

    @Test
    public void testScadere() {
        // fail(); metoda de break
        assertEquals(8.0, calculatorUT.substract(10, 2)); //teste unitare 5=2+3
        assertEquals(-6.0, calculatorUT.substract(-4, 2));
    }

    @Test
    public void testInmultire() {
        assertEquals(6.0, calculatorUT.multiply(2, 3)); //teste unitare 5=2+3
        assertEquals(-4.0, calculatorUT.multiply(2, -2));

    }

    @Test
    public void testImpartire() {
        assertEquals(6.0, calculatorUT.divide(12, 2)); //teste unitare 5=2+3
        assertEquals(1.0, calculatorUT.divide(2, 2));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            //() instanta functionala -> neparametrizata
            calculatorUT.divide(1, 0);
        });
        assertEquals("Divide by zero", exception.getMessage());
    }
}
