package org.design_patterns.builder;

public class ComputerBuilder {
    private String CPU;
    private int RAM;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public Computer build() {
        return new Computer(CPU, RAM);
    }
}
