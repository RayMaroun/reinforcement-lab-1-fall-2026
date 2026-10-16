package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }

        scanner.close();
    }
}
