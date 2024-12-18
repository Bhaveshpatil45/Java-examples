package lambda;

public class LambdaVoidExample {
    public static void main(String[] args) {

        PrintFunction printFunction = (int value) -> System.out.println("received value is: " + value);

        printFunction.print(5000);
    }
}
