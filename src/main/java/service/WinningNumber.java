package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WinningNumber {
    private static List<Integer> winningNumbers;

    public void split(String inputNumber) {
        int[] numbers = Stream.of(inputNumber.split(",")).mapToInt(Integer::parseInt).toArray();
        winningNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
    }
}
