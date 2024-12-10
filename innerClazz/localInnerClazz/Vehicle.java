package innerClazz.localInnerClazz;

public class Vehicle {
    int groundClearance;
    String brand;
    String model;
    Engine engine;

    public Vehicle(int groundClearance, String brand, String model, String engineType, String fuelType) {
        this.groundClearance = groundClearance;
        this.model = model;
        this.brand = brand;
        this.engine  = new Engine(engineType, engineType);
    }

    private static class Engine{
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

    public int getGroundClearance() {
        return groundClearance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
