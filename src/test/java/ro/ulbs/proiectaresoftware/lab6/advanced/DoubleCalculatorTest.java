package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;
    private final double DELTA = 0.0001;

    @BeforeEach
    public void setup() {

        calculator = new DoubleCalculator();
        calculator.init();
    }

    @Test
    public void testComplexOperations() {

        calculator.add(10.0).add(5.0).subtract(3.3).multiply(2.2);


        Assertions.assertEquals(25.74, calculator.result(), DELTA);
    }

    @Test
    public void testMultiplyWithSmallDecimals() {

        calculator.add(0.5).multiply(0.5); // 0.25


        Assertions.assertEquals(0.25, calculator.result(), DELTA);
    }



    @Test
    public void testDoubleDivideByZero() {

        calculator.init();


        calculator.divide(0.0);


        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.result());
    }

}