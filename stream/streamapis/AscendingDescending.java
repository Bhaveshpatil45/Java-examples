package stream.streamapis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Green", "Yellow", "White", "Black", "Violate");
        System.out.println("Original color List is: " + colours);

        List <String> ascendingOrder = colours.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Colours in Ascending order: " + ascendingOrder);

        List<String> descendingOder = colours.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Colours in descending order: " + descendingOder);
    }
}
