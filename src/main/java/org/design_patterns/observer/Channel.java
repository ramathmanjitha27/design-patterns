package org.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Observer> users = new ArrayList<>();

    public void addObserver(Observer observer) {
        users.add(observer);
    }

    public void notifyObservers(String message) {
        for(Observer observer : users) {
            observer.update(message);
        }
    }
}
