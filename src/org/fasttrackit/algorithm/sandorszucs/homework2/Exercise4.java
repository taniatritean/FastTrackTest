package org.fasttrackit.algorithm.sandorszucs.homework2;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("What multiplication table would you like to see?");
        int timesTable = inputScanner.nextInt();

        for(int i = 0; i <= 10; ++i) {
            int total = timesTable * i;
            System.out.println(timesTable + " x " + i + " = " + total);
        }
    }
}