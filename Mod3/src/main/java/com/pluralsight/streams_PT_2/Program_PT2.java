package com.pluralsight.streams_PT_2;

//Imports the Person class from the Streams Class and into PT 2
import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_PT2 {
    public static void main(String[] args) {
        //From previous Streams List
        List<Person> people = new ArrayList<>();
        people.add(new Person("Liam", "Smith", 25));
        people.add(new Person("Emma", "Johnson", 30));
        people.add(new Person("Noah", "Williams", 45));
        people.add(new Person("Olivia", "Brown", 22));
        people.add(new Person("Elijah", "Jones", 50));
        people.add(new Person("Ava", "Garcia", 28));
        people.add(new Person("James", "Miller", 35));
        people.add(new Person("Sophia", "Davis", 19));
        people.add(new Person("Ben", "Rodriguez", 60));
        people.add(new Person("Isabella", "Martinez", 40));

        //Ask the user to enter a name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search up a person: ");
        String name = scanner.nextLine().trim().toLowerCase();

        // Step 1: Use stream and filter to find matches
        List<Person> matchedPeople = people.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name))
                .toList();

        //Uses found if name is found
        System.out.println("\nFound Match:");
        //Uses is not name found
        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            matchedPeople.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
        }

        // Step 2: Use streams to calculate average age
        double averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        // Step 3: Use streams to find oldest and youngest age
        int maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);

        int minAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);

        // Display age statistics
        System.out.printf("\nAverage Age: %.1f\n", averageAge);
        System.out.println("Oldest Age: " + maxAge);
        System.out.println("Youngest Age: " + minAge);
    }
}
