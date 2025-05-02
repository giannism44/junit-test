package gr.aueb.cf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;

        int actualResult = calculator.add(a, b);
        //System.out.println(actualResult == expectedResult ? "Passed" : "Failed");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void subTwoIntegers() {
        Calculator calculator = new Calculator();
        int a = 40;
        int b = 10;
        int expectedResult = 30;

        int actualResult = calculator.sub(a, b);
       // System.out.println(actualResult == expectedResult ? "Passed" : "Failed");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divPositiveScenario()  throws Exception {
        Calculator calculator = new Calculator();

        int a = 40;
        int b = 10;
        int expectedResult = 4;

        int actualResult = calculator.div(a, b);
        // System.out.println(actualResult == expectedResult ? "Passed" : "Failed");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divNegativeScenario() {
        Calculator calculator = new Calculator();
        int a = 40;
        int b = 0;

        Assertions.assertThrows(Exception.class, () -> calculator.div(a, b));
    }
}