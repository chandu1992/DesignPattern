package com.interview.DesignPattern.creationalDesignPattern.prototype;

public class Employee implements Cloneable{

    public String name;
    public Employee(String name){
        this.name=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
