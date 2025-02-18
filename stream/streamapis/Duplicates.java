package stream.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,2,5,12,3,5,7,8,11,14,15);
        System.out.println("Printing original list: " + nums);
        List<Integer> duplicates = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after remove duplicates: " + duplicates);

    }
}
