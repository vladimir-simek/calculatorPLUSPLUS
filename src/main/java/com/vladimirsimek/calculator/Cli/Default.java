package com.vladimirsimek.calculator.Cli;

import com.vladimirsimek.calculator.Logic.Utilities;

public class Default {

    public static void getSplit() {
        System.out.println("------------------------------------------------------------------------------------");
    }

    public static void getName() {
        System.out.println("""
                 ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗    \s
                ██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗   \s
                ██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝   \s
                ██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗   \s
                ╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║   \s
                 ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝   \s""");
    }

    public static void welcome() {
        getSplit();
        getName();
        getSplit();
    }

    public static void mainMenu() {
        System.out.println("""
                A) Addition
                B) Subtraction
                C) Multiplication
                D) Division
                E) Powers
                F) Factorial
                G) Exit""");
        getSplit();
    }

    public static float[] getTwoNumbers() {
        float[] twoNumbers = new float[2];
        System.out.println("First number:");
        twoNumbers[0] = Utilities.getFloat();
        System.out.println("Second number:");
        twoNumbers[1] = Utilities.getFloat();
        return twoNumbers;
    }
}
