package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dimensiueSir;
        System.out.println("Dimensiunea sirului este:");
        dimensiueSir = input.nextInt();

        while(dimensiueSir%2==1) {
            System.out.println("Dati alta valoare");
            dimensiueSir=input.nextInt();
        }
        int[] Sir = new int[dimensiueSir];
        for (int index = 0; index<dimensiueSir;index++)
        {
            System.out.println("Dati nr de pe pozitia "+ (index+1));
            Sir[index] = input.nextInt();
        }
        System.out.println("Numerele primei umatati sunt:");
        for (int index = 0;index<dimensiueSir/2; index++)
        {
            System.out.println(Sir[index]*2);
        }
        System.out.println("Numerele celei de-a doua jumatate sunt:");
        for (int index = dimensiueSir/2;index<dimensiueSir;index++)
        {
            if (Sir[index]%2==1)
                System.out.println(Sir[index]*3);
            else
                System.out.println(Sir[index]);
        }
    }
}
