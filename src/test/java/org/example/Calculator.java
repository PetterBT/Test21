package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public static int add(String numbers) {
        if (!numbers.isEmpty()) {
            List<Integer> numbersList =Arrays.stream(numbers.split("[,\n]"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            return numbersList.stream()
                    .reduce(Integer::sum)
                    .orElseThrow();
        }
        return 0;
    }
}
