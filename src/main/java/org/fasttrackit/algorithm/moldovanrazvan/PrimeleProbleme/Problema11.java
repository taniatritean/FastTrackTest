package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema11
{
    public static void main(String[] args)
    {
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti n: ");
        int n = numar.nextInt();

        int sum = (n*(n+1))/2;

        System.out.println("Suma este: " + sum);
    }
}
