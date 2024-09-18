package pro.sky.calculatorWithTests.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorWithTests.exceptions.BadDivideParamException;
import pro.sky.calculatorWithTests.exceptions.BadParamException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceImplTest {

    private final CalcServiceImpl calcService = new CalcServiceImpl();
    private String expected;
    private String actual;

    @Test
    public void shouldCalculateCorrectSum() {
        expected = "2+3=5";
        actual = calcService.plus(2, 3);
        assertEquals(expected, actual);

    }

    @Test
    public void testPlusShouldThrowBadParamExceptionIfNum1IsNull() {
        try {
            calcService.plus(null, 3);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void testPlusShouldThrowBadParamExceptionIfNum2IsNull() {
        try {
            calcService.plus(2, null);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void shouldCalculateCorrectOdds() {
        expected = "5-3=2";
        actual = calcService.minus(5, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinusShouldThrowBadParamExceptionIfNum1IsNull() {
        try {
            calcService.minus(null, 3);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void testMinusShouldThrowBadParamExceptionIfNum2IsNull() {
        try {
            calcService.minus(5, null);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        expected = "2*2=4";
        actual = calcService.multiply(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyShouldThrowBadParamExceptionIfNum1IsNull() {
        try {
            calcService.multiply(null, 2);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void testMultiplyShouldThrowBadParamExceptionIfNum2IsNull() {
        try {
            calcService.multiply(2, null);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void shouldReturnCorrectDivideResult() {
        expected = "10/5=2";
        actual = calcService.divide(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideShouldThrowBadParamExceptionIfNum1IsNull() {
        try {
            calcService.divide(null, 5);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void testDivideShouldThrowBadParamExceptionIfNum2IsNull() {
        try {
            calcService.divide(10, null);
        } catch (BadParamException e) {
            assertEquals("один (оба) из параметров не определён(ы)", e.getMessage());
        }
    }

    @Test
    public void shouldThrowExceptionWhenDivisorIsZero() {
        try {
            calcService.divide(10, 0);
        } catch (BadDivideParamException e) {
            assertEquals("Делить на ноль - нельзя!!!", e.getMessage());
        }
    }
}
