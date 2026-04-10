package com.pluralsight;

import java.util.Objects;
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
        int sumOfNumbers = firstNumber + secondNumber;
        int quotientOfNumbers = firstNumber / secondNumber;
        int differenceOfNumbers = firstNumber - secondNumber;

        if (Objects.equals(calculationOption, "A")) {
            System.out.println(firstNumber + " + " + secondNumber + " = " + sumOfNumbers);
        } else if (Objects.equals(calculationOption, "S")) {
            System.out.println(firstNumber + " - " + secondNumber + " = " + differenceOfNumbers);
        } else if (Objects.equals(calculationOption, "M")) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + productOfNumbers);
        } else if (Objects.equals(calculationOption, "D")) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + quotientOfNumbers);
        }
    }
}
