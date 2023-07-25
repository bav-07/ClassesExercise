package com.qa.arrays;

import com.qa.classes.Person;

import java.util.*; // imports the entire util package, this is more efficient because the compiler will sort out what you need

public class Runner {

    public static void main(String[] args) {
        int[] nums = new int[10];
//        System.out.println("0: " + nums[10]); index out of bounds exception, as max index is 9

        for (int i = 0; i < 10; i++) {
            nums[i] = i * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + nums[i]);
        }

        // inline initialisation of array (uses curly braces)
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println(i + ": " + chars[i]);
        }

        // looping through backwards
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(i + ": " + chars[i]);
        }

        // Enhanced for loop
        // for char c IN chars
        for (char c : chars) {
            System.out.println(c);
        }

        Person[] people = new Person[3];
        people[0] = new Person("Aswene", 24, "Black", "Trainer");
        people[1] = new Person("Jordan B", 26, "black", "Trainer");
        people[2] = new Person("Andy", 16, "Brown", "Trainer");

        for (Person p : people) System.out.println(p);

        // This would be a problem because the Integer wrapper class is being used, for which empty values are set to null and not 0
        //for (int i : new Integer[3]) System.out.println(i); // don't mix ints and integers
        // Saving an int as an Integer is a technique known as Boxing

        // A String in Java is just an array of characters
        for (char c : "Jordan Harrison".toCharArray()) {
            System.out.println(c);
        }

        // first sighting of <> here it just denotes the type of the list
        // requires a class - you can have a list of objects, but you cannot have a list of primitives
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Size: " + numbers.size());
        numbers.add(3);
        System.out.println("Size: " + numbers.size());
        numbers.add(6);
        System.out.println("Size: " + numbers.size());
        numbers.add(9);
        System.out.println("Size: " + numbers.size());
        numbers.add(12);
        System.out.println("Size: " + numbers.size());

        System.out.println("Arrays: " + nums);
        System.out.println("List: " + numbers);

        numbers.remove(2);
        System.out.println("List: " + numbers);

        // Creating a list with preset values
        List<String> words = List.of("Hello", "World", "I", "Like", "Java");
        System.out.println(List.of().getClass().getName());
        for (String word : words) System.out.println(word);
        // However this makes it an immutable list, so you can't add or remove values to/from it
        //words.add("Hi");

        // Do this instead to make a mutable preset list
        List<String> words2 = new ArrayList<>(List.of("Hello", "World", "I", "Like", "Java"));
        words2.add("Hi");
        for (String word : words2) System.out.println(word);

        // Side note
        // var is a keyword, that means the compiler infers the type of the variable
        var num = 11;
        // but you cannot then change the type
        //num = "hello"; // this doesn't work
        // Technically you can do this but you are only working with one type, that type is object
        List<Object> objs = List.of(12, 35, true, "hello"); // This does have limitations

        // Note to self: look up var args and static nested classes
        // Side note ended

        // StringBuilder
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            sb.append(" ");
        }

        System.out.println("SB: " + sb);

        System.out.println(sb.reverse());

    }

}
