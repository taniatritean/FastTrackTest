package src.org.fasttrackit.algorithm.sandorszucs.homework;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nr of the NUMBERS (SHOULD BE AN EVEN NR)");
        int numbersEntered = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[numbersEntered];
        for (int i = 0; i < numbersEntered; i++) {
            System.out.println("Insert the nr in the array:");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int[] x = new int[array.length / 2];

        for (int i = 0; i < (array.length / 2); i++) {
            x[i] = (array[i] * 2);
        }
        int[] a = new int[array.length / 2];
        int[] b = new int[array.length / 2];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = (array.length / 2); i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a[counter1] = array[i];
                counter1++;
            } else {
                b[counter2] = (array[i] * 3);
                counter2++;
            }
        }
        System.out.println("Doubled numbers, first part of the array are equal to:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Numbers from the second part of the array are (3x odd numbers):");

        for (int i = 0; i < counter2; i++) {
            System.out.println(b[i]);
        }
        System.out.println("Even numbers, second part of the array are equal to:");
        for (int i = 0; i < counter1; i++) {
            System.out.println(a[i]);
        }
    }
}