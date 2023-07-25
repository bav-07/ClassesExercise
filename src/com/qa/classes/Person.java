package com.qa.classes;

import com.qa.oop.Animal;

import java.util.ArrayList;
import java.util.List;

public class Person {

    // instance variables
    private static String latinName = "Homo Sapien";

    private String name;

    private int age;

    // If you have a final variable, set it in the constructor
    // If this is supposed to be constant for all instances in the class, it should be static and set here
    private final String naturalHairColour;

    private String job;

    private List<Animal> pets = new ArrayList<>();

    // Constructor: Method used to generate instances of a class (object)
    // constructors don't have a return type, and the name MUST match the class name
    public Person(String name, int age, String naturalHairColour, String job) {
        super();
        this.setName(name);
        this.setAge(age);
        this.naturalHairColour = naturalHairColour;
        this.setJob(job);
    }

    // default constructor - provided by Java if you don't create your own
    public Person() {
        super();
        this.naturalHairColour = "";
    }
    // overloaded my constructor, so I can create a blank person or a full one
    // this is Polymorphism, one of the many types of it
    // you cannot have two methods with the same method signature (e.g. both take in one parameter of the same data type, wouldn't work)

    // Constructor Chaining
    // this means using another constructor within your constructor
    public Person(String name, String naturalHairColour, String job) {
        this(name, 0, naturalHairColour, job); // calls another constructor to save on repeating logic
    }

    public void intro() {
        System.out.println("Hello my name is " + name + " and I am " + age + " years old " + job + " with " + naturalHairColour + " hair.");
    }

    public boolean addPet(Animal pet) {
        return this.pets.add(pet);
    }

    // command + n to generate al getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String getNaturalHairColour() {
        return naturalHairColour;
    }

//    public void setNaturalHairColour(String naturalHairColour) {
//        this.naturalHairColour = naturalHairColour;
//    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    // this isn't really needed
    public static String getLatinName() {
        return latinName;
    }

    public static void setLatinName(String newLatinName){
        latinName = newLatinName;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    // lets you print the object using sout
    @Override
    public String toString() {
        return "Hello my name is " + name + " and I am " + age + " years old " + job + " with " + naturalHairColour + " hair.";
    }
}
