package org.fasttrackit.algorithm.sandorszucs.homework2;
import java.util.Scanner;

public class Exercise1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");

            double number1 = input.nextDouble();
            System.out.println("Enter the second number: ");

            double number2 = input.nextDouble();
            double sumOfNumbers = (number1 + number2) / 2;

            System.out.println("The arithmetical value of the numbers is: " + sumOfNumbers);
        }
    }