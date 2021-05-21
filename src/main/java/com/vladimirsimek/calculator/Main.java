package com.vladimirsimek.calculator;

import com.vladimirsimek.calculator.Logic.Utilities;

import static com.vladimirsimek.calculator.Cli.Default.*;



public class Main {
    public static void main(String[] args) {
        Utilities.UtilInit();
        welcome();
        while (true) {
            mainMenu();
            Utilities.doMath(Utilities.getString());
        }

    }
}
