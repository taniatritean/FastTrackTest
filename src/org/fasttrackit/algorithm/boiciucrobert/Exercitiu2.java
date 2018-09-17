package org.fasttrackit.algorithm.boiciucrobert;

import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate numere vrei sa inserezi?");
        int length = sc.nextInt();
        double sum = 0.0D;
        int[] numbers = new int[length];

        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("Scrie numarul: ");
            numbers[i] = sc.nextInt();
            sum += (double)numbers[i];
        }

        double mean = sum / (double)numbers.length;
        System.out.println("Suma numerelor este " + sum);
    }
}
