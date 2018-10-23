package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

public class Problema5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, m, i, j;
        int TablaInmultirii;
        System.out.println("Dati numerele:");
        n=input.nextInt();
        m=input.nextInt();
        if (n<m)
        {
            for (i=n;i<=m;i++)
            {
                for(j=n;j<=m;j++)
                {
                    TablaInmultirii=i*j;
                    System.out.println(" "+i+"*"+j+"="+TablaInmultirii);
                }
            }
        }else
        {
            for (i=m;i<=n;i++)
            {
                for (j=m;j<=n;j++) {
                    TablaInmultirii = i * j;
                    System.out.println(" " + i + "*" + j + "=" + TablaInmultirii);
                }
            }
        }
    }
}
