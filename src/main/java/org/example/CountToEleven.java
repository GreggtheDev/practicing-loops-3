package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Please enter a number less than 11:");
        number = scanner.nextInt();

        if (number >= 11) {
            System.out.println("The number must be less than 11.");
        } else {
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

