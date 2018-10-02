package org.fasttrackit.algorithm.robertszilagyi.PrimeleTeme;

import java.util.Scanner;

public class Exercitiu11
{
    public static void main(String[] args)
    {
        Scanner primulNumar = new Scanner(System.in);
        System.out.println("Introduceti primul numar :");
        int n = primulNumar.nextInt();

        int rezultat = (n*(n+1))/2;

        System.out.println("Suma numerelor este : " + rezultat);
    }
}
