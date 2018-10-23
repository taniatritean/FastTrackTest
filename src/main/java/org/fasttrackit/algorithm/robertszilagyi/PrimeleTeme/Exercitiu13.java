package org.fasttrackit.algorithm.robertszilagyi.PrimeleTeme;

import java.util.Scanner;

public class Exercitiu13
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int a = scan.nextInt();
        if(a >9 && a <24)
            System.out.println("True ");
        else
            System.out.println("False ");
    }
}
