package org.fasttrackit.algorithm.georgiana;
//Se da numarul n. Sa se afiseze inversul lui
import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        int inv=0;
        System.out.println("Dati numarul: ");
        n=input.nextInt();
        int aux=n;
        while(n!=0)
        {
            inv=inv*10+(n%10);
            n=n/10;
        }
        System.out.println("Inversul este:"+inv);
        if (aux==inv)
            System.out.println("Numarul este palindrom!");
        else
            System.out.println("Numarul nu este palindrom!");

    }
}
