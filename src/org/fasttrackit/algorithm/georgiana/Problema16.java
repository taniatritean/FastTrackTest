package org.fasttrackit.algorithm.georgiana;
//Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
import java.util.Scanner;

public class Problema16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int dimensiuneSir;
        System.out.println("Dati dimensiunea sirului:");
        dimensiuneSir = input.nextInt();
        int[] tablou = new int[dimensiuneSir];

        for (int index=0;index<tablou.length;index++)
        {
            System.out.println("Dati numarul de pe pozitia:"+(index+1));
            tablou[index] = input.nextInt();
        }
        System.out.println("Perechile de numere in care primul este mai mare decat al doilea sunt:");
        for (int index=0;index<tablou.length-1;index++)
        {
            if (tablou[index]>tablou[index+1])
            {
                System.out.println("("+(tablou[index])+","+tablou[index + 1]+")");
            }
        }
    }
}
