package org.design_patterns;

import org.design_patterns.factory.Vehicle;
import org.design_patterns.factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
////        Singleton design pattern implementation
//        Singleton obj = Singleton.getInstance();
//        obj.showMesssage();
//
//        Singleton obj2 = Singleton.getInstance();
//        obj2.showMesssage();

        //Factory design pattern implementation
        Vehicle car = VehicleFactory.getVehicle("car");
        assert car != null;
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        assert bike != null;
        bike.drive();

        car.drive();
    }
}