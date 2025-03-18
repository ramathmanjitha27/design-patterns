package org.design_patterns;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.showMesssage();

        Singleton obj2 = Singleton.getInstance();
        obj2.showMesssage();
    }
}