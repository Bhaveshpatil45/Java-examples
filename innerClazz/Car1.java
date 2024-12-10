package innerClazz;

public class Car1 {
    int groundClearance;
    String brand;
    String model;
    Engine engine;

    public Car1(int groundClearance, String brand, String model, Engine engine) {
        this.groundClearance = groundClearance;
        this.engine = engine;
        this.model = model;
        this.brand = brand;
    }

    public static class Engine{
        String engineType;
        String fuelType;

        public Engine(String engineType, String fuelType) {
            this.engineType = engineType;
            this.fuelType = fuelType;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    ", fuelType='" + fuelType + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car1{" +
                "groundClearance=" + groundClearance +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
