package com.qa;

import com.qa.classes.Person;

public class Runner {

    public static void main(String[] args) {

        Person p1 = new Person(); // will instantiate a Person object

        p1.setName("Jordan");
        p1.setAge(29);
//        p1.setNaturalHairColour("black");
        p1.setJob("Trainer");

        p1.intro();

        Person p2 = new Person(); // will instantiate a Person object

        p2.setName("Andy");
        p2.setAge(24);
//        p2.setNaturalHairColour("brown");
        p2.setJob("Trainer");

        p2.intro();

        Person p3 = p2;
        p3.setName("Andy M");
        p2.intro();
        p3.intro();

        // Objects in Java can be null (primitives cannot be null)
        p3 = null;
        p2.intro();
        //p3.intro(); // null pointer exception

        p3 = new Person("Aswene", 24, "Black", "Trainer");
        p3.intro();

        System.out.println(Person.getLatinName());
        Person.setLatinName("Homo Superior");
        System.out.println(Person.getLatinName());

        // cannot be reassigned
        final double gravity = 9.82;

        final Person p4 = new Person("Jordan B", 26, "black", "Trainer");
        p4.setName("Jordan Benbelaid");

        final int i;
        i = 27;
        System.out.println(i);

        p1.intro();
        System.out.println(p1); // uses the toString method

    }

}
