package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Please enter a number:");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Program ended.");
                break;
            } else if (number < 0) {
                System.out.println("Your number must be positive.");
            } else {
                System.out.println("You entered a positive number: " + number);
            }
        }

        scanner.close();
    }
}

