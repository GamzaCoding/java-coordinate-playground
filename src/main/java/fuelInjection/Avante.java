package fuelInjection;

public class Avante extends Car {
    private final int distance;
    private final int fuelEfficiency = 15;
    private final String carName = "Avante";
    public Avante(int distance){
        this.distance = distance;
    }
    @Override
    protected int calculateFuelEfficiency() {
        return distance / fuelEfficiency;
    }
    @Override
    public String getCarName() {
        return carName;
    }
}
