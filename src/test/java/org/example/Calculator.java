package org.example;

public class Calculator {
    public static int add(String numbers) {
        if (!numbers.equals("")) {
            return Integer.parseInt(numbers);
        }
        return 0;
    }
}
