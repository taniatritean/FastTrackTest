package org.fasttrackit.algorithm.sandorszucs.HomeWork;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Enter a number & I REVERSE it for you: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        int reversedNumber;
        for(reversedNumber = 0; temp > 0; temp /= 10) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
        }

        System.out.println("Your number reversed is: " + reversedNumber);
    }
}
