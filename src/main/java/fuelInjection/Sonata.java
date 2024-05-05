package fuelInjection;

import java.util.HashMap;

public class Sonata implements Car {
    private static final int FUEL_EFFICIENCY = 10;
    private final int distance;
    private final String carName = "Sonata";
    public Sonata(int distance){
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
