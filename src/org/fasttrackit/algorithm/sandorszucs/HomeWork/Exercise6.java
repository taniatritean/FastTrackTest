package org.fasttrackit.algorithm.sandorszucs.HomeWork;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int numbers = 64321;
        int sum = 0;
        int multiplication = 1;
        int copy = numbers;

        //Calculates the sum of the digits of a specific number
        while (copy > 0) {
            int add = copy % 10;
            sum += add;
            copy /= 10;
        }
        copy = numbers;

        // Calculates the multiplication of the number
        while (copy > 0) {
            int digit = copy % 10;
            multiplication *= digit;
            copy /= 10;
        }
        System.out.println(sum);
        System.out.println(multiplication);


        System.out.println("Please, enter a number: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int b = sc.nextInt();
        int length = String.valueOf(b).length();
        System.out.println("This number has " + length + " digits");
        System.out.println();



        int smallest = 9;int largest = 0;
        System.out.println("Enter a number & I tell you which is the largest and smallest digit: ");
        int enteredNumber = sc.nextInt();
        while (enteredNumber > 0) {
            int digit = enteredNumber % 10;
            if (digit > largest)
                largest = digit;
            if (digit < smallest)
                smallest = digit;
            enteredNumber /= 10;
        }
        System.out.println("Largest digit of the entered number is: " + largest);
        System.out.println("Smallest digit of the entered number is: " + smallest);
    }
}