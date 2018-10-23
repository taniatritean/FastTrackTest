package org.fasttrackit.algorithm.georgiana;
//Se da numarul n. Sa se afiseze inversul lui
import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        int inv=0;
        System.out.println("Dati numarul: ");
        n=input.nextInt();
        while(n!=0)
        {
            inv=inv*10+(n%10);
            n=n/10;
        }
        System.out.println("Inversul este:"+inv);


    }
}
