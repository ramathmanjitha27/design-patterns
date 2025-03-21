package org.design_patterns;

import org.design_patterns.builder.Computer;
import org.design_patterns.builder.ComputerBuilder;
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

//        //Factory design pattern implementation
//        Vehicle car = VehicleFactory.getVehicle("car");
//        assert car != null;
//        car.drive();
//
//        Vehicle bike = VehicleFactory.getVehicle("bike");
//        assert bike != null;
//        bike.drive();
//
//        car.drive();


        //Builder design pattern Implementation
        Computer computer = new ComputerBuilder()
                            .setCPU("intel i7")
                            .setRAM(8)
                            .build();

        computer.showConfig();

        Computer computer2 = new ComputerBuilder()
                .setCPU("intel i5")
                .setRAM(4)
                .build();

        computer2.showConfig();
    }
}