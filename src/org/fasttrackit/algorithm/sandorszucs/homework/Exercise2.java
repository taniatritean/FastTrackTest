package org.fasttrackit.algorithm.sandorszucs.homework;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like to insert?");
        int length = sc.nextInt();
        double sum = 0.0D;
        int[] numbers = new int[length];

        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("Enter the next number: ");
            numbers[i] = sc.nextInt();
            sum += (double)numbers[i];
        }

        double mean = sum / (double)numbers.length;
        System.out.println("Sum of the number is " + sum);
        System.out.println("Mean of the number is " + mean);
    }
}