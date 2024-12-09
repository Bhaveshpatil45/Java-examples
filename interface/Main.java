import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scan.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scan.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scan.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scan.nextDouble();
                shape = new Rectangle(length, width);
                break;
            case 3:
                System.out.print("Enter base of the triangle: ");
                double base = scan.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scan.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("The area of the selected shape is: " + shape.calculateArea());

    }
}
