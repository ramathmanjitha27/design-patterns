package org.design_patterns;

import org.design_patterns.adapter.TypeC;
import org.design_patterns.adapter.TypeCAdapter;
import org.design_patterns.adapter.USB;
import org.design_patterns.builder.Computer;
import org.design_patterns.builder.ComputerBuilder;
import org.design_patterns.composite.Directory;
import org.design_patterns.composite.File;
import org.design_patterns.decorator.*;
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


//        //Builder design pattern Implementation
//        Computer computer = new ComputerBuilder()
//                            .setCPU("intel i7")
//                            .setRAM(8)
//                            .build();
//
//        computer.showConfig();
//
//        Computer computer2 = new ComputerBuilder()
//                .setCPU("intel i5")
//                .setRAM(4)
//                .build();
//
//        computer2.showConfig();

//        //Adapter Design Pattern
//        USB adapter = new TypeCAdapter(new TypeC());
//        adapter.connectWithUsbCable();

//        //Decorator pattern implementation
//        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee.makeCoffee());
//
//        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.makeCoffee());
//
//        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.makeCoffee());

        //composite pattern implementation
        File file1 = new File("Document.txt");
        File file2 = new File("Photo.png");

        Directory folder = new Directory("My Folder");
        folder.add(file1);
        folder.add(file2);
        folder.showDetails();
    }
}