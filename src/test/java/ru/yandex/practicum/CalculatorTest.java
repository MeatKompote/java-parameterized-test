package ru.yandex.practicum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Calculator;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

    public CalculatorTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                { 1, 9, 10},
                { 1, 0, 1},
        };
    }

    @Test
    public void shouldBeSum() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumPositive() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int firstNumber = 1;
        int secondNumber = 9;
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        int expected = 10;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void shouldSumPositiveAndZero() {
        Calculator calculator = new Calculator(); // создали экземпляр класса
        int firstNumber = 1;
        int secondNumber = 0;
        int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
        int expected = 1;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }
}

