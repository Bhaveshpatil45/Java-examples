package stream.streamapis;

import java.util.Arrays;
import java.util.List;

public class Average{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,6,8,10,18,36);
        System.out.println("List of numbers: " + nums);
        Double average = nums .stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average values of said numbers: " + average);
    }
}
