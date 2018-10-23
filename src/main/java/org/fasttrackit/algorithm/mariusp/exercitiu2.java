package org.fasttrackit.algorithm.mariusp;
import java.util.Scanner;

public class exercitiu2 {
    public static void main(String arg[]){
        int n,sum=0,medie=0;

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
        {
            sum+=a[i];
            medie= sum/n;
        }
        System.out.println("media celor "+n+" numere este ="+medie);
    }
}