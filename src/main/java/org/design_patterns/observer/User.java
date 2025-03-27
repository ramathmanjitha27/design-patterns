package org.design_patterns.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("User: " + name + " received update: " + message);
    }
}
