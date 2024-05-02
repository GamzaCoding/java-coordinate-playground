package fuelInjection;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private final List<Car> rentCars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }
    public void addCar(Car car) {
        rentCars.add(car);
    }
    public String generateReport() {
        StringBuilder st = new StringBuilder();

        for (Car rentCar : rentCars) {
            st.append(rentCar.getCarName())
                    .append(" : ")
                    .append(rentCar.calculateFuelEfficiency())
                    .append("리터\n");
        }

        return st.toString();
    }
}
