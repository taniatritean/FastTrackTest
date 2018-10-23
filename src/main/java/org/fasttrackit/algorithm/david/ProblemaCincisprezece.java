package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaCincisprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar:");

        int a=scanner.nextInt();
        int b=1;
        for(int i=1;i<=a;i++){
            b*=i;
        }

        System.out.println("Factorialul numarului "+a+" este egal cu "+b);


    }
}
