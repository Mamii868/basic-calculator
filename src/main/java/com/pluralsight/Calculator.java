package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");

        int secondNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.print("Please select an option: ");

        String calculationOption = scanner.nextLine();

        int productOfNumbers = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber + " = " + productOfNumbers);
    }
}
