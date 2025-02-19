package stream.streamapis;

import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 9 , 10, 11, 12, 13);
        System.out.println("Original List is: " + numbers);

        int sumOfEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even Numbers: " + sumOfEven);

        int sumOfOdd = numbers.stream()
                .filter(nums-> nums % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Odd numbers: " + sumOfOdd);

    }
}
