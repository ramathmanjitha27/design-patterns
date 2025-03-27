package org.design_patterns.composite;

public class File implements FileSystem{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("FILE : " + this.name);
    }
}
