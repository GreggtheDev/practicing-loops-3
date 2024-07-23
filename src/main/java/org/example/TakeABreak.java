package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("yes")) {
            System.out.println("Do you want to take a break?");
            input = scanner.nextLine();
        }

        System.out.println("Break time!");
        scanner.close();
    }
}

