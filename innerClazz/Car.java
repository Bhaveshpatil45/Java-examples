package innerClazz;

public class Car {
    int groundClearance;
    String Brand;
    String model;
    String engine;

    public Car(int groundClearance, String brand, String model, String engine) {
        this.groundClearance = groundClearance;
        Brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public static class Engine{
        String engineType;
        String fuelType;

        public Engine(String engineType, String fuelType) {
            this.engineType = engineType;
            this.fuelType = fuelType;
        }
    }
}
