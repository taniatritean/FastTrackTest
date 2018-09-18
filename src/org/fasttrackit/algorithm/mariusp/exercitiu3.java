package org.fasttrackit.algorithm.mariusp;
import java.util.Scanner;

public class exercitiu3 {
    public static void main(String arg[]){
        int n,max=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("numarul de numere dorit:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("introduceti cele "+n+" numere ");
        for(int i=0;i<n;i++)
        {
            System.out.println("introduceti numarul  "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
            if (a[i] > max) {
                max = a[i];
            }
        System.out.println("maximul din cele "+n+" numere este ="+max);
    }
}