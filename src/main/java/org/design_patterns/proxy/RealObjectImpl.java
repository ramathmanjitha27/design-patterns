package org.design_patterns.proxy;

public class RealObjectImpl implements RealObject {

    public void request() {
        System.out.println("Processing request...");
    }
}
