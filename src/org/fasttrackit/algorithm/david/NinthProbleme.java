package org.fasttrackit.algorithm.david;
import java.util.Scanner;

public class NinthProbleme {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        int a = scanner.nextInt();
        int cifra = 0;
        int b = 0;
        int c = 0;
        int x = 0;
        while (a != 0) {
            cifra = a % 10;
            if (a % 2 != 0) {
                b = b * 10 + cifra;
            } else {
                c = c * 10 + cifra;
            }
            a /= 10;
        }
        int finalB = 0;
        while (b != 0) {
            int numar = b % 10;
            finalB = finalB * 10 + numar;
            b /= 10;
        }
        int finalC = 0;
        while (c != 0) {
            int numar = c % 10;
            finalC = finalC * 10 + numar;
            c /= 10;
        }
        double finalFinalC = Math.pow(finalC, 2);
        System.out.println("b este egal cu " + finalB);
        System.out.println("c este egal cu " + finalFinalC);
    }
}
