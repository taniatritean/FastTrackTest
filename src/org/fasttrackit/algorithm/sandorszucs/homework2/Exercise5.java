package org.fasttrackit.algorithm.sandorszucs.homework2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Enter the first wished number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second wished number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }

        for(int i = firstNumber; i <= secondNumber; ++i) {
            System.out.println(firstNumber + "x" + i + " = " + firstNumber * i + "           |             " + secondNumber + "x" + i + "  = " + secondNumber * i);
        }
    }
}