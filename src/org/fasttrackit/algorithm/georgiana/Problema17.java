package org.fasttrackit.algorithm.georgiana;
//Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
 //suma = 1+x + x la puterea 2 + x la puterea 3 + ….+ x la puterea n .

import java.lang.Math;
import java.util.Scanner;

public class Problema17
{
    public static void main(String[] args)
    {
    double x;
    double n;
        Scanner input = new Scanner (System.in);
        System.out.println("Dati x:");
        x = input.nextDouble();
        System.out.println("Dati n:");
        n = input.nextDouble();
        double suma=0;
        for (int index=0;index<=n;index++)
        {
            suma = suma + Math.pow(x,index);
        }
        System.out.println("Suma numerelor este:"+suma);
    }
}
