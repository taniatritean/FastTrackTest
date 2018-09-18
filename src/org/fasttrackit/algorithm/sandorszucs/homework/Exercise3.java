package org.fasttrackit.algorithm.sandorszucs.homework;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = input.nextInt();
        int[] numbers = new int[length];

        int largest;
        for(largest = 0; largest < numbers.length; ++largest) {
            System.out.println("Enter the next number: ");
            numbers[largest] = input.nextInt();
        }

        largest = numbers[0];

        for(int i = 0; i < numbers.length; ++i) {
            if (numbers[i] > largest) {
                largest = numbers[i];//try just with one for - largest number can be computed while
                // reading in order to avoid getting the elements twice - once to read and once to compute max
                //like exercise2
            }
        }

        System.out.println("The largest number you have entered is: " + largest);
    }
}