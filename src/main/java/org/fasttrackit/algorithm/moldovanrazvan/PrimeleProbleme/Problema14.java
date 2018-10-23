package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema14
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        double a = scan.nextInt();

        Scanner scann = new Scanner(System.in);
        System.out.println("Introduceti b: ");
        double b = scann.nextInt();

        double rezultat = Math.pow(a,b);

        System.out.println("a la puterea b este: " + rezultat);
    }
}
