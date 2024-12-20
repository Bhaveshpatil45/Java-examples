package defaultAndStaticMethods;

import defaultAndStaticMethods.model.Circle;
import defaultAndStaticMethods.model.Shape;
import defaultAndStaticMethods.model.Square;

public class DefaultAndStaticMethodDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.paint();
        Shape.erase();

        System.out.println("------------------------------");
        shape = new Square();
        shape.draw();
        shape.paint();
        Shape.erase();
    }
}
