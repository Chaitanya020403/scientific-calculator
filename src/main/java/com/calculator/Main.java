package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);//This is a comment
        boolean running = true;

        System.out.println("========================================");
        System.out.println("   Welcome to Scientific Calculator");
        System.out.println("========================================");

        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("  1. Square Root  (√x)");
            System.out.println("  2. Factorial    (x!)");
            System.out.println("  3. Natural Log  (ln x)");
            System.out.println("  4. Power        (x^b)");
            System.out.println("  5. Exit");
            System.out.print("\nEnter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter x: ");
                        double sqrtInput = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println("√" + sqrtInput + " = " + calc.squareRoot(sqrtInput));
                        break;
                    case 2:
                        System.out.print("Enter n (non-negative integer): ");
                        int factInput = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println(factInput + "! = " + calc.factorial(factInput));
                        break;
                    case 3:
                        System.out.print("Enter x: ");
                        double lnInput = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println("ln(" + lnInput + ") = " + calc.naturalLog(lnInput));
                        break;
                    case 4:
                        System.out.print("Enter base (x): ");
                        double base = Double.parseDouble(scanner.nextLine().trim());
                        System.out.print("Enter exponent (b): ");
                        double exp = Double.parseDouble(scanner.nextLine().trim());
                        System.out.println(base + "^" + exp + " = " + calc.power(base, exp));
                        break;
                    case 5:
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
