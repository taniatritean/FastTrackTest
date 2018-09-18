package org.fasttrackit.algorithm.horatiu;

import java.util.Scanner;

public class MedieAritmeticaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int nr = sc.nextInt();
        try {
            if (nr < 0) {
                System.out.println("Number must be positiv!");
            } else if (nr < 2) {
                System.out.println("To get the average we need at last two numbers!");
            } else {
                double sum = 0.0d;
                double numbers[] = new double[nr];
                for (int i = 0; i < numbers.length; ++i) {
                    System.out.println("Enter number " + (i + 1));
                    numbers[i] = sc.nextDouble();
                    if (numbers[i] > 0) {
                        sum += numbers[i];

                    } else {
                        System.out.println("Number must be positiv!");
                        break;
                        }
                }
                double average = sum / numbers.length;
                System.out.println("Averege of the number is " + average);
            }
        } catch (Exception err) {

            System.out.println("Must be number!");
        }
    }
}