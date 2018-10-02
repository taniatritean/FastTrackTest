package org.fasttrackit.algorithm.horatiu;
//Sa se determine maximul a N numere citite de la tastatura.

import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        try {
            int nr = sc.nextInt();
            double max = 0.0d;
            double min = 0.0d;
            double numbers[] = new double[nr];
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println("Enter number " + (i + 1));
                numbers[i] = sc.nextDouble();
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (min == 0 && numbers[i] <= min) {
                    min = numbers[i];
                } else if (min < numbers[i] && numbers[i] <= 0) {
                    min = numbers[i];
                }
              }
              if (min != 0){System.out.println("Maximun negative number is: " + min);
              } else {System.out.println("Maximun positive number is: " + max);
              }
        } catch (Exception e) {
            System.out.println("Must be number!");
        }
    }
}