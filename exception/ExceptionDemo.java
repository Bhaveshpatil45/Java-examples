package exception;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        int []marks = new int[5];
        System.out.println("----------Before marks data assignment complete----------");
        marks[0] = 95;
        System.out.println("----------After marks data assignment complete----------");
        marks[1] = 90;
        System.out.println("----------After marks data assignment complete----------");
        marks[2] = 82;
        System.out.println("----------After marks data assignment complete----------");
        marks[3] = 71;
        System.out.println("----------After marks data assignment complete----------");
        marks[4] = 95;

        try{
            System.out.println("----------After marks data assignment complete----------");
            marks[5] = 95;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("you are doing something wrong." +
                    "we have only 5 subject and you must not insert marks for 6th subject " +
                    "and the technical reason is " + exception.getMessage());
        }
        System.out.println("marks of the student x: " + Arrays.toString(marks));


    }
}
