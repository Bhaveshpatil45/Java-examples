package arrayoperations;

import java.util.Arrays;

public class CopingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        int[] arrCopy = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arrCopy));
    }
}
