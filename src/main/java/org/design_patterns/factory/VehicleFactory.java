package org.design_patterns.factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("car")) return new Car();
        else if(type.equalsIgnoreCase("Bike")) return new Bike();
        return null;
    }
}
