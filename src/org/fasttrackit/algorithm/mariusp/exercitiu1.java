package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Primul numar=");
        double a = input.nextDouble();

        System.out.println("Al doilea numar=");
        double b=input.nextDouble();

        double c = (a + b) / 2;
        System.out.println("Media aritmetica este:" + c);

    }
}

