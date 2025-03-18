package org.design_patterns;

//class Singleton {
//    private static Singleton instance;
//
//    private Singleton() {
//    };
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//
//    public void showMesssage() {
//        System.out.println("Singleton Instance Called" + instance);
//    }
//}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {};

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMesssage() {
        System.out.println("Singleton Instance Called" + instance);
    }
}
