package Calculator;

import org.example.Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CalculatorJTest {
    private final Calculator calculatorUT =new Calculator();
    @Test
    public void testImpartire(){
        assertThat(calculatorUT.substract(2,-2)).
                isEqualTo(-1);
        assertThat(calculatorUT.substract(2,-2)==4).
                isTrue().
                isInstanceOf(Calculator.class);
    }
    @Test
    public void testDivide(){
        assertThatThrownBy(()-> calculatorUT.divide(2,2))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Divide by zero");
    }
}
