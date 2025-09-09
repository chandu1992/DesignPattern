package com.interview.DesignPattern.singleton;

public class CallSingleton {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance("Chandra");
        Singleton obj2 = Singleton.getInstance("Pande");

        System.out.println("Object 1 : "+obj1 + " --->"+obj1.name);
        System.out.println("Object 2 : "+obj2 + " --->"+obj2.name);
    }
}
