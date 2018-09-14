package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class FifthProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar de la tastatura:");
        int N=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mai dati un numar de la tastatura:");
        int M=scanner.nextInt();
        scanner.nextLine();

        for(int i=N;i<=M;i++){
            System.out.println(N+" X "+i+" = "+(N*i)+"      |      "+M+" X "+i+" = "+(M*i));
        }
    }
}
