package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaSaptesprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        double a=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mai dati un numar:");
        double x=scanner.nextInt();
        scanner.nextLine();
        double b=Math.pow(3+a+a+a,x);
        double c=Math.pow(2+a+a,b);
        double d=Math.pow(1+a,c);

        System.out.println("Rezultatul este egal cu "+d);
    }
}
