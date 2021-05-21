package com.vladimirsimek.calculator.Logic;

import com.vladimirsimek.calculator.Cli.Default;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Utilities {
    private static Scanner sc;

    public static void UtilInit() {
        sc = new Scanner(System.in);
    }

    public static float getFloat() {
        return Float.parseFloat(sc.nextLine());
    }

    public static String getString() {
        return sc.nextLine().toUpperCase(Locale.ROOT);
    }

    public static void doMath(String option) {
        if (Objects.equals(option, "G")) {
            System.exit(0);
        } else if (Objects.equals(option, "A")) {
            System.out.println("Result: " + Math.addition(Default.getTwoNumbers()));
        } else if (Objects.equals(option, "B")) {
            System.out.println("Result: " + Math.subtraction(Default.getTwoNumbers()));
        } else if (Objects.equals(option, "C")) {
            System.out.println("Result: " + Math.multiplication(Default.getTwoNumbers()));
        } else if (Objects.equals(option, "D")) {
            System.out.println("Result: " + Math.division(Default.getTwoNumbers()));
        } else if (Objects.equals(option, "E")) {
            System.out.println("Result: " + Math.powers(Default.getTwoNumbers()));
        } else if (Objects.equals(option, "F")) {
            System.out.println("Number:");
            System.out.println("Result: " + Math.factorial(getFloat()));
        }
        Default.getSplit();
    }
}
