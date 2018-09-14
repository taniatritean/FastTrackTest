package org.fasttrackit.algorithm.sandorszucs.HomeWork;
import java.util.Scanner;

public class Exercise15 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int factorial = sc.nextInt();
        int result = 1;   //AS A FACTORIAL ITS minimal VALUE MUST BE 1

        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println("The factorial of the entered number is: " + result);

    }
}