package org.fasttrackit.algorithm.sandorszucs.homework;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Check whether your number is Polindrom or Not");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int userEnteredNumber = number;

        int remainder;
        int temp;
        for(temp = 0; number > 0; temp = temp * 10 + remainder) {
            remainder = number % 10;
            number /= 10;
        }

        if (userEnteredNumber == temp) {
            System.out.println("Your number IS Polindrome");
        } else {
            System.out.println("Your number IS NOT Polindrome");
        }
    }
}
