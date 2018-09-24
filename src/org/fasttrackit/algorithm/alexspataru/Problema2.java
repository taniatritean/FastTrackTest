package org.fasttrackit.algorithm.alexspataru;
import  java.util.Scanner;

public class Problema2 {
    /** 2.	Sa se calculeze media aritmetica a N numere pozitive citite de la tastatura */

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int n, sum = 0, mediaArtimetica, ok = 1;
        int index = 1;
        n = scan.nextInt();

        int[] a;
        a = new int[100];

        while (index <= n) {
            a[index] = scan.nextInt();
            index++;
        }
        for (index = 1; index <= n; index++){
            if (a[index] >= 0 )
                sum += a[index];
            else {
                System.out.println("Number " + a[index] + "It is negative");
                ok = 0;
            }
        }
        System.out.println(sum);
        if (ok == 0)
            System.out.println("Not all numbers are positive");
        else {
            mediaArtimetica = sum / n;
            System.out.println("MA = " + mediaArtimetica);
        }

    }


}
