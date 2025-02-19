package stream.streamapis;

import java.util.Arrays;
import java.util.List;

public class Average{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,12,2,5,3,9,7);
        System.out.println("Original List of number is: " + numbers);

        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of list is: " + average);
    }
}
