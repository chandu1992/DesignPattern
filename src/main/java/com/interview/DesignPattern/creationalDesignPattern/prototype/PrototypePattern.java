package com.interview.DesignPattern.creationalDesignPattern.prototype;

public class PrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee("chandra");
        Employee emp2 =(Employee) emp1.clone();
        System.out.println(emp1==emp2); // false ( both are not same )
    }
}
