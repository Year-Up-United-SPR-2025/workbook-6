package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Step 1: Create a list of 10 people
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

        // Step 2: Ask the user to enter a name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search up a person: ");
        String name = scanner.nextLine().trim().toLowerCase();

        // Step 2.5: Create a new list to store matched people
        List<Person> matchedPeople = new ArrayList<>();

        // Step 3: Use a for loop to find and collect matches
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name)) {
                matchedPeople.add(p);
            }
        }

        // Step 4: Display the names of people in the matched list
        System.out.println("\nFound Match:");
        if (matchedPeople.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person p : matchedPeople) {
                System.out.println(p.getFirstName() + " " + p.getLastName());
            }
        }

        // Step 5: Calculate average, max, and min ages
        int totalAge = 0;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age; // Add to total for average
            if (age > maxAge) maxAge = age; // Update max age
            if (age < minAge) minAge = age; // Update min age
        }

        // Step 6: Display age statistics
        double averageAge = (double) totalAge / people.size();
        System.out.printf("\nAverage Age: %.1f\n", averageAge);
        System.out.println("Oldest Age: " + maxAge);
        System.out.println("Youngest Age: " + minAge);
    }
}
