package exception.customException;

import java.util.Arrays;
import java.util.List;


public class Factory {
    String factoryType;
    String factoryLocation;
    List<String> LOCATION = Arrays.asList("pune","mumbai","nashik");

    public Factory(String factoryType, String location) throws FactoryLocationNotFoundException {
        this.factoryType = factoryType;
        if (LOCATION.contains(location.toLowerCase())){
            this.factoryLocation = location.toLowerCase();
        }else {
            throw new FactoryLocationNotFoundException("You have entered location apart from predefined location.");

        }
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryType='" + factoryType + '\'' +
                ", factoryLocation='" + factoryLocation +
                '}';
    }
}
