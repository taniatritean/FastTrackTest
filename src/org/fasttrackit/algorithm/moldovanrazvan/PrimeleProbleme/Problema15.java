package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema15
{
    public static void main(String[] args)
    {

        Scanner factor = new Scanner(System.in);
        System.out.println("Introduceti numarul caruia i se va calcula factorialul: ");
        int nr = factor.nextInt();

        System.out.println("Factorialul numarului este: " + factorial(nr));
    }

    public static int factorial(int n)
    {
        if(n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


}
