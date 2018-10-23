package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

public class Problema14
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b;
        int i=1;
        int x=1;
        System.out.println("Dati cele doua numere:");
        a=input.nextInt();
        b=input.nextInt();
        while (i<=b)
        {
            x=x*a;
            i++;
        }
        System.out.println("Numarul ridicat la putere este:"+x);
    }
}
