package stream.streamapis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecificLatter {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Green", "Yellow", "White", "Blue","Black");
        System.out.println("original list is: " + colours);
        char colorLatter = 'B';

        long ctr = colours.stream()
                .filter(s -> s.startsWith(String.valueOf(colorLatter)))
                .count();
        System.out.println("Number of color starting with: " + colorLatter + " = " + ctr);

        char colorLatter2 = 'G';
        long ctr2 = colours.stream()
                .filter(s -> s.startsWith(String.valueOf(colorLatter2)))
                .count();
        System.out.println("Number of color start with: " + colorLatter2 + " = " + ctr2);

    }
}
