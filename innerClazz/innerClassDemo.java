package innerClazz;

public class innerClassDemo {
    public static void main(String[] args) {
        Car1.Engine engine = new Car1.Engine("1 ltr turbo","petrol");
        Car1 car = new Car1(200, "Mahindra", "Xuv300", engine);
        printCarDetails(car);
        printCarEngineDetails(car.engine);

    }
    private static void printCarDetails(Car1 car){
        System.out.println("Car Details" + car);
    }
    private static void printCarEngineDetails(Car1.Engine engine){
        System.out.println("Car Details" + engine);
    }
}
