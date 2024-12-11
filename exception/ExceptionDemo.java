package exception;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
        processMarksUsingTryCatch();

        try {
            processMarksUsingThrows();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    private static void processMarksUsingTryCatch() {
        int[] marks = new int[5];

        System.out.println("----------Before marks data assignment----------");
        marks[0] = 95;
        System.out.println("----------marks[0] data assignment complete----------");
        marks[1] = 90;
        System.out.println("----------marks[1] data assignment complete----------");
        marks[2] = 82;
        System.out.println("----------marks[2] data assignment complete----------");
        marks[3] = 71;
        System.out.println("----------marks[3] data assignment complete----------");
        marks[4] = 67;
        System.out.println("----------marks[4] data assignment complete----------");

        try {
            marks[5] = 95;
            System.out.println("----------marks[5] data assignment complete----------");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("You are doing something wrong. " +
                    "We have only 5 subjects, and you must not insert marks for a 6th subject. " +
                    "Technical reason: " + exception.getMessage());
        }

        System.out.println("Marks of the student x: " + Arrays.toString(marks));
    }

    private static void processMarksUsingThrows() throws Exception {
        int[] marks = new int[5];

        System.out.println("----------Before marks data assignment----------");
        marks[0] = 95;
        System.out.println("----------marks[0] data assignment complete----------");
        marks[1] = 90;
        System.out.println("----------marks[1] data assignment complete----------");
        marks[2] = 82;
        System.out.println("----------marks[2] data assignment complete----------");
        marks[3] = 71;
        System.out.println("----------marks[3] data assignment complete----------");
        marks[4] = 67;
        System.out.println("----------marks[4] data assignment complete----------");

        try {
            marks[5] = 95;
            System.out.println("----------marks[5] data assignment complete----------");
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new Exception("Why are you inserting marks of a 6th subject?");
        }

        System.out.println("Marks of the student x: " + Arrays.toString(marks));
    }
}


