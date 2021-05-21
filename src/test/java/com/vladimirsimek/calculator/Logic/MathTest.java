package com.vladimirsimek.calculator.Logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void addition() {
        float[] a = {5, 8};
        float[] b = {16, 4};
        float[] c = {3, 2};
        assertEquals(Math.addition(a), 13.0);
        assertEquals(Math.addition(b), 20.0);
        assertEquals(Math.addition(c), 5.0);
    }

    @Test
    void subtraction() {
        float[] a = {8, 5};
        float[] b = {16, 4};
        float[] c = {3, 2};
        assertEquals(Math.subtraction(a), 3.0);
        assertEquals(Math.subtraction(b), 12.0);
        assertEquals(Math.subtraction(c), 1.0);
    }

    @Test
    void multiplication() {
        float[] a = {5, 5};
        float[] b = {16, 4};
        float[] c = {3, 2};
        assertEquals(Math.multiplication(a), 25.0);
        assertEquals(Math.multiplication(b), 64.0);
        assertEquals(Math.multiplication(c), 6.0);
    }

    @Test
    void division() {
        float[] a = {5, 5};
        float[] b = {16, 4};
        float[] c = {3, 2};
        assertEquals(Math.division(a), 1.0);
        assertEquals(Math.division(b), 4.0);
        assertEquals(Math.division(c), 1.5);
    }

    @Test
    void powers() {
        float[] a = {5, 2};
        float[] b = {2, 2};
        float[] c = {4, 2};
        assertEquals(Math.powers(a), 25.0);
        assertEquals(Math.powers(b), 4.0);
        assertEquals(Math.powers(c), 16.0);
    }

    @Test
    void factorial() {
        float a = 5;
        float b = 2;
        float c = 4;
        assertEquals(Math.factorial(a), 120.0);
        assertEquals(Math.factorial(b), 2.0);
        assertEquals(Math.factorial(c), 24.0);
    }
}