package com.qa.oop;

public class Cat extends Animal {

    public Cat(boolean hasFur, int noOfLegs, boolean fluffy, String colour) {
        super(hasFur, noOfLegs, fluffy, colour);
    }

    public Cat(){
        super(); // super references a constructor in the parent
        // super() should be the first call in the constructor because you should reference the parent class before
        // using any of the methods inherited from the parent
    }

    public Cat(boolean hasFur, int noOfLegs, boolean fluffy) {
        super(hasFur, noOfLegs, fluffy);
    }

    @Override // Annotation -> flags to the compiler (not required until we get to Spring, where code is routed through them(?))
    public void speak() {
        System.out.println("MEOW");
    }


}
