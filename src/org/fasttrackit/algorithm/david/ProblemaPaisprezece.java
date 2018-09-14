package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaPaisprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        double a=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mai dati un numar:");
        double b=scanner.nextInt();


        System.out.println("Numarul "+a+" la puterea "+b+" este egal cu "+Math.pow(a,b));

    }
}
