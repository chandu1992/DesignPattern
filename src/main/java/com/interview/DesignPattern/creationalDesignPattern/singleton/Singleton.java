package com.interview.DesignPattern.creationalDesignPattern.singleton;

public final class Singleton {

    private static Singleton obj;
    public  String name;

    private Singleton(String name){
        this.name=name;
    }

    static Singleton getInstance(String name){

        if(obj==null){
            obj = new Singleton(name);
        }
        return obj;
    }
}
