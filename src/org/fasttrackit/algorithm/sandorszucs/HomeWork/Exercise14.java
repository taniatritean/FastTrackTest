package org.fasttrackit.algorithm.sandorszucs.HomeWork;
import java.util.Scanner;

public class Exercise14 {
    public static void main (String args[]) {

        double firstNum, secondNum;
        System.out.println("Enter the FIRST number: ");
        Scanner sc = new Scanner(System.in);
        firstNum = sc.nextInt();

        System.out.println("Enter the SECOND number");
        secondNum = sc.nextInt();

        double total = Math.pow(firstNum,secondNum);

        System.out.println("Number " + firstNum + " raised to power of " + secondNum + " is " +  total);


    }
}