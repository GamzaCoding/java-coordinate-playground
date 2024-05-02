package fuelInjection;

public class Sonata extends Car {
    private final int distance;
    private final int fuelEfficiency = 10;
    private final String carName = "Sonata";
    public Sonata(int distance){
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
