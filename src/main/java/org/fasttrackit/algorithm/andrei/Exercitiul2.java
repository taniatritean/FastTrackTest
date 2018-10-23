package org.fasttrackit.algorithm.andrei;

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = 0;

        System.out.println("Cate numere doriti sa introduceti de la tastatura:");
        int numar=scanner.nextInt();

        for(int i=0;i<numar;i++){
            System.out.println("Introduceti un numar de la tastatura:");
            sum+=scanner.nextDouble();
            scanner.nextLine();
            n++;
        }
        double media =sum/n;
        System.out.println("Media aritmetica este: " + media);
    }
}