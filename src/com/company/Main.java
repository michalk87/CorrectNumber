package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Give me a number");

            number = scanner.nextInt();

        } while (number != 10);

        System.out.println("Congratulations! You come to!");

    }
}
