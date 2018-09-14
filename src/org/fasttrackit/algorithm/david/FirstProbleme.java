package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class FirstProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar pozitiv:");
        double a=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Dati al doilea numar pozitiv:");
        double b=scanner.nextDouble();
        scanner.nextLine();

        double medieAritmetica=(a+b)/2;

        System.out.println("Media arimtetica a numarului "+a+" si a numarului "+b+" este egala cu "+medieAritmetica);
    }
}
