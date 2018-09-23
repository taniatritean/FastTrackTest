package org.fasttrackit.algorithm.sandorszucs.homework;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise18 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to have in your array? ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.println("Insert the numbers in array: ");
            a[i] = scan.nextInt();
        }
        boolean crescator = true;
        int i = 0;
        while (i < nr - 1 && crescator) {
            if (a[i] > a[i + 1]) {
                crescator = false;
            }
            i++;
        }
        if (crescator) {
            System.out.println("Array has ascending order");
        } else {
            Arrays.sort(a);
            System.out.println("The array has been rearranged:");
        }
        for (int j = 0; j < nr; j++) {
            System.out.println(a[j]);
        }
    }
}