package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    public void setup() {

        calculator = new NewIntCalculator();
        calculator.init();
    }

    @Test
    public void testAddWithPositiveAndNegative() {

        calculator.add(10).add(-3); // 10 + (-3) = 7


        Assertions.assertEquals(7, calculator.result(), "Adunare cu - nu merge");
    }

    @Test
    public void testSubtract() {

        calculator.add(15).subtract(5).subtract(2); // 15 - 5 - 2 = 8


        Assertions.assertEquals(8, calculator.result());
    }

    @Test
    public void testMultiplyByZero() {

        calculator.add(10).multiply(0);


        Assertions.assertEquals(0, calculator.result(), "Înmulțirea cu zero este zero");
    }



    @Test
    public void testDivideByZeroException() {

        calculator.init();


        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        });
    }

}