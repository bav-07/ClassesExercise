package com.qa.oop;

public class Dog extends Animal {

    public Dog(boolean hasFur, int noOfLegs, boolean fluffy, String colour) {
        super(hasFur, noOfLegs, fluffy, colour);
    }

    public Dog(boolean hasFur, int noOfLegs, boolean fluffy) {
        super(hasFur, noOfLegs, fluffy);
    }

    public Dog() {
        super();
    }

    @Override
    public void speak(){
        System.out.println("woof");
    }

    public void fetch(){
        System.out.println("GOOD BOI");
    }

}
