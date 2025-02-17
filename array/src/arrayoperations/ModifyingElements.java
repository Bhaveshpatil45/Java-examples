package arrayoperations;

import java.util.Arrays;

public class ModifyingElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
    }
}
