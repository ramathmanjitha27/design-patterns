package org.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String name;
    private List<FileSystem> contents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        this.contents.add(fileSystem);
    }

    public void showDetails(){
        System.out.println("Directory : " + this.name);
        for(FileSystem item : contents){
            item.showDetails();
        }
    }
}
