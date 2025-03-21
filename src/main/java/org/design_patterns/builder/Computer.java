package org.design_patterns.builder;

public class Computer {
    private String CPU;
    private int RAM;

    public Computer(String CPU, int RAM){
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public void showConfig(){
        System.out.println("CPU: " + CPU + " RAM: " + RAM);
    }
}
