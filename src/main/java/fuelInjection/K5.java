package fuelInjection;

public class K5 implements Car {
    private static final int FUEL_EFFICIENCY = 13;
    private final int distance;
    private final String carName = "K5";
    public K5(int distance){
        this.distance = distance;
    }
    @Override
    public int calculateFuelEfficiency() {
        return distance / FUEL_EFFICIENCY;
    }

    @Override
    public String getCarName(){
        return carName;
    }
}
