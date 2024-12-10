package innerClazz.localInnerClazz;

import innerClazz.Car1;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(400,"TATA","THX633","3 Ltr turbo","diesel");

        printTruckDetails(truck);
        printTruckEngineDetails(truck.getEngine());

    }
    private static void printTruckDetails(Vehicle truck){
        System.out.println("truck Details" + truck);
    }
    private static void printTruckEngineDetails(Object engine){
        System.out.println("Truck Details" + engine);
    }
}
