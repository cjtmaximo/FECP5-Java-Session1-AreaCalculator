package org.example;

import java.util.*;

public class Main {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        int userChoice = userInput.nextInt();

        if (userChoice == 1) {
            System.out.print("Enter the radius: ");
            double radius = userInput.nextDouble();

            double area = calculateCircleArea(radius);
            System.out.printf("Area of the circle: %.2f", area);
        } else if (userChoice == 2) {
            System.out.print("Enter the base: ");
            double base = userInput.nextDouble();

            System.out.print("Enter the height: ");
            double height = userInput.nextDouble();

            double area = calculateTriangleArea(base, height);
            System.out.printf("Area of the triangle: %.2f", area);
        } else if (userChoice == 3) {
            System.out.print("Enter the length: ");
            double length = userInput.nextDouble();

            System.out.print("Enter the width: ");
            double width = userInput.nextDouble();

            double area = calculateRectangleArea(length, width);
            System.out.printf("Area of the rectangle: %.2f", area);
        }
    }
}