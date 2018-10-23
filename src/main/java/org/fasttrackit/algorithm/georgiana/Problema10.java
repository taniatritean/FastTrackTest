package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

public class Problema10
    //Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Dati numarul de cautat:");
        int n;
        int vizibil=0;
        n=input.nextInt();
        int[] a={2,6,7,9,12,16,19,27,43,45};
        int i;
        for (i=0;i<9;i++)
        {
            if (a[i]==n)
            {
                System.out.println("Numarul este pe pozitita:" + i);
                vizibil = 1;
            }
        }
if (vizibil==0)
    System.out.println(-1);
     }
}
