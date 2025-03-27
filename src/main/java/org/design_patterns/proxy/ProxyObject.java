package org.design_patterns.proxy;

public class ProxyObject implements RealObject {
    private RealObjectImpl realObjectImpl;

    public void request() {
        if(realObjectImpl == null) {
            realObjectImpl = new RealObjectImpl();
        }
        System.out.println("Proxy controlling access...");
        realObjectImpl.request();
    }
}
