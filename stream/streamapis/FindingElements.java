package stream.streamapis;

import java.util.Arrays;
import java.util.List;

public class FindingElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,82,73,42,5,12,13,51,23,56,97);
        System.out.println("Original list of number is: " + numbers);

        int secondSmallest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Smallest number is: " + secondSmallest);

        int secondLargest = numbers.stream()
                .sorted((a,b) -> Integer.compare(b,a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second largest number is: " + secondLargest);
    }
}
