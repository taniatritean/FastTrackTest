package org.fasttrackit.algorithm.georgiana;

import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n,i;
        int p=1;
        System.out.println("Dati numarul:");
        n=input.nextInt();
        for (i=1;i<=n;i++)
            p=p*i;
        System.out.println(n+"!="+p);
    }
}
