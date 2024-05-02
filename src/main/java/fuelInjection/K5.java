package fuelInjection;

public class K5 extends Car {
    private final int distance;
    private final int fuelEfficiency = 13;
    private final String carName = "K5";
    public K5(int distance){
        this.distance = distance;
    }
    @Override
    protected int calculateFuelEfficiency() {
        return distance / fuelEfficiency;
    }

    @Override
    public String getCarName(){
        return carName;
    }
}
