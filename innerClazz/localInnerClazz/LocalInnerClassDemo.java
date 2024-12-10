package innerClazz.localInnerClazz;

import innerClazz.Car1;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(400,"TATA","THX633","3 Ltr turbo","diesel");

        printTruckDetails(truck);
        printCarEngineDetails(car.engine);

    }
    private static void printTruckDetails(Vehicle truck){
        System.out.println("truck Details" + truck);
    }
    private static void printTruckEngineDetails(Car1.Engine engine){
        System.out.println("Car Details" + engine);
    }
}
