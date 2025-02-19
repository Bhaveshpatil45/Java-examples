package stream.streamapis;

import java.util.Arrays;
import java.util.List;

public class MinAndMaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,55,12,3,56,78,14,54,92);
        System.out.println("Original List of numbers is : " + numbers);

        int min_val = numbers.stream()
                .min(Integer::compareTo)
                .orElse(null);
        System.out.println("The minimum Value is: " + min_val);
        
        int max_value = numbers.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("The maximum value is: " + max_value);
    }
}
