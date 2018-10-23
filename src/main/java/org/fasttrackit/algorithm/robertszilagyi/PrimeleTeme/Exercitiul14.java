package org.fasttrackit.algorithm.robertszilagyi.PrimeleTeme;

import java.util.Scanner;

public class Exercitiul14
{
    public static void main(String[] args)
    {
        Scanner primulNumar = new Scanner(System.in);
        System.out.println("Introduceti primul numar :");
        double a = primulNumar.nextInt();

        Scanner alDoileaNumar = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar :");
        double b = alDoileaNumar.nextInt();


        double rezultat = Math.pow(a,b);
        System.out.println("Rezultatul :"+rezultat);
    }
}
