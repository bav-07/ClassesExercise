package com.qa.oop;

public class Runner {

    public static void main(String[] args) {
        Animal c = new Cat();
        Dog d = new Dog(true, 4, true, "Brown");
        Animal a = d;

        c.speak();
        d.speak();
        d.fetch();
//        a.fetch(); // you cannot use the specific methods of the dog when you've insantiated it as its parent class

        ((Dog) a).fetch(); // downcasting Animal into Dog
        // you cannot cast a subclass into a sibling class, will get ClassCastException
        // you can upcast (treating a class as its super-class)

        // How do you check if your animal is a dog?
        // use instanceof
        if (a instanceof Dog) ((Dog) a).fetch(); // downcasting treats the animal as a dog
        // you should check if a is an instanceof before downcasting, otherwise you can run into errors
        // generally you should avoid downcasting altogether by structuring your code better



    }

}
