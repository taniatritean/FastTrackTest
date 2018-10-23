package org.fasttrackit.algorithm.georgiana;
import java.util.Scanner;
public class Problema4
{
    public static void main(String[] args)
    {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Dati numarul:");
        x=input.nextInt();
        int i;
        int TablaInmultirii;
        for (i=0;i<=10;i++)
        {
            TablaInmultirii=i*x;
            System.out.println(" "+i+"*"+x+"="+TablaInmultirii);
        }
    }
}
