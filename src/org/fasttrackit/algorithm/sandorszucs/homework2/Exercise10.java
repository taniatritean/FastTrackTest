package org.fasttrackit.algorithm.sandorszucs.homework2;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int v = 0;
        int[] a = new int[30];
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("What number would you like to search?");
        int x = sc.nextInt();

        int index;
        for(index = 0; index < n; ++index) {
            System.out.println("Enter the elements of the string");
            a[index] = sc.nextInt();
        }

        while(flag) {
            flag = false;

            for(int j = 0; j < n - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("The organized string is: ");

        for(index = 0; index < n; ++index) {
            System.out.print(" a =  " + a[index] + "  ");
        }
        System.out.print("\n");

        for(index = 0; index < n; ++index) {
            if (a[index] == x) {
                System.out.println("The number you find at " + index + " position");
                break;
            }
            ++v;
        }

        if (v == n) {
            System.out.println("-1");
        }
    }
}