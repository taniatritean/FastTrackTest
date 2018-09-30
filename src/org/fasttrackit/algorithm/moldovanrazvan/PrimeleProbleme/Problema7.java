package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema7
{
    public static void main(String[] args)
    {
        int invers = 0;

        Scanner nr = new Scanner(System.in);
        System.out.println("Introduceti numarul care doriti sa fie inversat: ");
        int a = nr.nextInt();

        while(a != 0)
        {
            invers = invers * 10;
            invers = invers + a % 10;
            a = a / 10;
        }
        System.out.println("Numarul inversat este: " + invers);
    }
}
