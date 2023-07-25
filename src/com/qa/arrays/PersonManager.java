package com.qa.arrays;

import com.qa.classes.Person;

import java.util.*;

public class PersonManager {

    private List<Person> people = new ArrayList<>();

    public boolean addPerson(Person person) {
        return this.people.add(person);
    }

    // varargs
    // allows you to put in any number of arguments, and compresses it into an array
    public boolean addPeople(int pos, Person... people) {

        int expected = this.people.size() + people.length;
        List<Person> peopleList = Arrays.asList(people);
        Collections.reverse(peopleList);
        for (Person toAdd: peopleList) this.people.add(pos, toAdd);
        return this.people.size() == expected;

    }

    @Override
    public String toString() {
        return "PersonManager{" +
                "people=" + people +
                '}';
    }

    public static void main(String[] args) {
        PersonManager manager = new PersonManager();
        manager.addPerson(new Person("Jordan", 29, "black", "Trainer"));
        System.out.println(manager);

        manager.addPeople(1, new Person("Andy", 21, "Red", "T"), new Person("Bandy", 21, "Red", "T"), new Person("Sandy", 21, "Red", "T"));
        System.out.println(manager);

    }

}
