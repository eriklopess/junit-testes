package eriklopess.testes.calculatorprogram.calculator;

import eriklopess.testes.calculatorprogram.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void ShouldReturnZeroWhenNoValueWereGiven() {
        Calculator calc = new Calculator();

        double sum = calc.sum();

        Assertions.assertEquals(0, sum);
    }

    @Test
    public void ShouldReturnTheSumOfGivenValues() {
        Calculator calc = new Calculator();

        double sum = calc.sum(3, 6);

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void ShouldReturnTheSubtractionOfGivenValues() {
        Calculator calc = new Calculator();

        double sub = calc.sum(3, -6);

        Assertions.assertEquals(-3, sub);
    }

    @Test
    public void ShouldReturnZeroWhenNoValueWereGivenForSubtraction() {
        Calculator calc = new Calculator();

        double sub = calc.sum();

        Assertions.assertEquals(0, sub);
    }
}
