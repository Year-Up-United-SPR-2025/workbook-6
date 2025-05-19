package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Portfolio p = new Portfolio("Jordan's Portfolio", "Jordan");

        p.add(new Gold(1));
        p.add(new Jewelry("Necklace", 2));
        p.add(new House(2000, 2500, 3));

        System.out.println("The total value of the portfolio is: " + p.getValue());
    }
}