package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

//Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa
 //se afiseze in ordine crescatoare
public class Problema18
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int dimensiuneSir;
        System.out.println("Dimensiunea sirului este:");
        dimensiuneSir = input.nextInt();
        int[] Sir = new int[dimensiuneSir];
        for (int index=0;index<dimensiuneSir;index++)
        {
            System.out.println("Numerele din sir sunt:");
            Sir[index] = input.nextInt();
        }
        int index;
        int auxInterschimbare;
        int verificare = 1;
        for (index = 0;index<dimensiuneSir-1;index++)
        {
            if (Sir[index]>Sir[index+1])
                verificare = 0;
        }
        if (verificare ==1)
            System.out.println("Sirul este ordonat crescator!");
        else System.out.println("Sirul nu este ordonat crescator!");
        if (verificare == 0)
        {
            System.out.println("Sirul se va ordona!");
            for (index = 0;index<dimensiuneSir-1;index++)
            {
                for (int index2 = index+1;index2 < dimensiuneSir;index2++)
                {
                    if (Sir[index]>Sir[index2])
                    {
                        auxInterschimbare=Sir[index];
                        Sir[index]=Sir[index2];
                        Sir[index2] = auxInterschimbare;
                    }
                }
            }
        }
        System.out.println("Sirul ordonat este:");
        for (index=0;index<dimensiuneSir;index++)
            System.out.println(Sir[index]+" ");
    }
}
