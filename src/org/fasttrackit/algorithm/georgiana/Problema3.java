package org.fasttrackit.algorithm.georgiana;
//Sa se determine maximul a N numere citite de la tastatura.
import java.util.Scanner;

public class Problema3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        int i;
        System.out.println("Dati numarul de numere: ");
        n=input.nextInt();
        int[] tablou = new int[n];
        for (i=0;i<n;i++)
        {
            System.out.println("Dati numarul de pe pozitia "+(i+1));
            tablou[i]=input.nextInt();
        }
        int max;
        max=tablou[0];
        for (i=1;i<n;i++)
        {
            if (tablou[i]>max)
                max=tablou[i];
        }
        System.out.println("Numarul maxim este: "+max);
    }
}
