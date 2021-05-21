package com.vladimirsimek.calculator.Logic;

import com.vladimirsimek.calculator.Cli.Default;

public class Math {
    public static float addition(float[] twoNumbers) {
        return twoNumbers[0] + twoNumbers[1];
    }

    public static float subtraction(float[] twoNumbers) {
        return twoNumbers[0] - twoNumbers[1];
    }

    public static float multiplication(float[] twoNumbers) {
        return twoNumbers[0] * twoNumbers[1];
    }

    public static float division(float[] twoNumbers) {
        return twoNumbers[0] / twoNumbers[1];
    }

    public static float powers(float[] twoNumbers) {
        float a = twoNumbers[0];
        for (int i = 0; i < twoNumbers[1] -1; i++) {
            a *= twoNumbers[0];
        }
        return a;
    }

    public static float factorial(float number) {
        int i, factorial = 1;
        for (i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
