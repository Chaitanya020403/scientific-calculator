package com.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    ScientificCalculator calc = new ScientificCalculator();

    // --- Square Root Tests ---
    @Test
    public void testSquareRootPositive() {
        assertEquals(4.0, calc.squareRoot(16), 0.0001);
    }

    @Test
    public void testSquareRootZero() {
        assertEquals(0.0, calc.squareRoot(0), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegative() {
        calc.squareRoot(-9);
    }

    // --- Factorial Tests ---
    @Test
    public void testFactorialZero() {
        assertEquals(1L, calc.factorial(0));
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120L, calc.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calc.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialTooLarge() {
        calc.factorial(21);
    }

    // --- Natural Log Tests ---
    @Test
    public void testNaturalLogOne() {
        assertEquals(0.0, calc.naturalLog(1), 0.0001);
    }

    @Test
    public void testNaturalLogE() {
        assertEquals(1.0, calc.naturalLog(Math.E), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogZero() {
        calc.naturalLog(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        calc.naturalLog(-5);
    }

    // --- Power Tests ---
    @Test
    public void testPowerPositive() {
        assertEquals(8.0, calc.power(2, 3), 0.0001);
    }

    @Test
    public void testPowerZeroExponent() {
        assertEquals(1.0, calc.power(5, 0), 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        assertEquals(0.25, calc.power(2, -2), 0.0001);
    }

    @Test
    public void testPowerFractional() {
        assertEquals(2.0, calc.power(4, 0.5), 0.0001);
    }
}
