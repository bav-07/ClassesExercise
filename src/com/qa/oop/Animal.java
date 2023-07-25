package com.qa.oop;

public class Animal {

    private boolean hasFur;
    private int noOfLegs;
    private boolean fluffy;
    private String colour;

    // Constructors are like lawyers: if you don't have one, one will be provided for you
    public Animal(boolean hasFur, int noOfLegs, boolean fluffy, String colour) {
        super();
        this.hasFur = hasFur;
        this.noOfLegs = noOfLegs;
        this.fluffy = fluffy;
        this.colour = colour;
    }

    public Animal(boolean hasFur, int noOfLegs, boolean fluffy) {
        this.hasFur = hasFur;
        this.noOfLegs = noOfLegs;
        this.fluffy = fluffy;
    }

    public Animal() {
        super();
    }

    public void sleep(){
        System.out.println("zzzzzz");
    }

    public void walk(){

    }

    public void speak() {
        System.out.println("DEFAULT NOISE ACTIVATED");
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
