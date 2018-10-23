package org.fasttrackit.algorithm.sandorszucs.homework;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers would you like to enter: ");
        int enteredNumber = scanner.nextInt();

        int[] array = new int[enteredNumber];
        for (int i = 0; i < enteredNumber; i++) {
            System.out.println("Insert numbers in the array:");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("The requested numbers are: ");

        for (int i = 1; i < enteredNumber; i++) {
            if (array[i - 1] > array[i]) {
                System.out.println(array[i - 1] + " " + array[i] + " - ");
            }
        }
    }
}