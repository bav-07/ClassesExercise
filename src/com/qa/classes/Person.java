package com.qa.classes;

public class Person {

    // instance variables
    private String name;

    private int age;

    private String hairColour;

    private String job;

    // Constructor: Method used to generate instances of a class (object)
    // constructors don't have a return type, and the name MUST match the class name
    public Person(String name, int age, String hairColour, String job) {
        super();
        this.setName(name);
        this.setAge(age);
        this.setHairColour(hairColour);
        this.setJob(job);
    }

    // default constructor - provided by Java if you don't create your own
    public Person() {
        super();
    }
    // overloaded my constructor, so I can create a blank person or a full one
    // this is Polymorphism, one of the many types of it
    // you cannot have two methods with the same method signature (e.g. both take in one parameter of the same data type, wouldn't work)

    // Constructor Chaining
    // this means using another constructor within your constructor
    public Person(String name, String hairColour, String job) {
        this(name, 0, hairColour, job); // calls another constructor to save on repeating logic
    }

    public void intro() {
        System.out.println("Hello my name is " + name + " and I am " + age + " years old " + job + " with " + hairColour + " hair.");
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

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
