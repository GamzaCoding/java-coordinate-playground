package fuelInjection;

public class Avante implements Car {
    private static final int FUEL_EFFICIENCY = 15;
    private final int distance;
    private final String carName = "Avante";
    public Avante(int distance){
        this.distance = distance;
    }
    @Override
    public int calculateFuelEfficiency() {
        return distance / FUEL_EFFICIENCY;
    }

    @Override
    public String getCarName() {
        return carName;
    }
}
