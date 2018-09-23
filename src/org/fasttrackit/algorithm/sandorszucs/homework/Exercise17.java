package org.fasttrackit.algorithm.sandorszucs.homework;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number and the square: ");
        int x = scan.nextInt();
        int n = scan.nextInt();
        double sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + Math.pow(x, i);
        }
        System.out.println("Total is: " + sum);
    }
}
