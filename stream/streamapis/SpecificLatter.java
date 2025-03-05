package stream.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecificLatter {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("9926123465", "9926127580","9923998124", "9926126574");
        System.out.println("Original number are: " + numbers);
        String count = "9926";

        long counts = numbers.stream()
                .filter(s -> s.startsWith(count))
                .count();
        System.out.println(counts);
    }
}
