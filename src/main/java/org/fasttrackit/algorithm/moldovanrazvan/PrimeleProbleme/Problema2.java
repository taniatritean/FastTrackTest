package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema2
{
    public static void main(String[] args) {
        System.out.println("Pentru cate numere doriti sa se calculeze media aritmetica ? ");
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int[] numere = new int[nr];
        double sum = 0;

        System.out.println("Introduceti numerele : ");
        for (int i = 0; i < nr; i++)
        {
            numere[i]=scan.nextInt();
        }

        for(int i = 0; i < nr; i++)
        {
            sum += numere[i];
        }


        double medieAritmetica = sum / nr;
        System.out.println("Media aritmetica este: " + medieAritmetica);
    }
}
