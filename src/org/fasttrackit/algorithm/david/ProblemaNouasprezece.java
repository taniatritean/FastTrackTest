package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaNouasprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati numarul de numere(sa fie par, pt a se putea imparti la 2):");
        int nrDeNr=scanner.nextInt();
        scanner.nextLine();
        int[] sir=new int[nrDeNr];
        for(int i=0;i<nrDeNr;i++){
            System.out.println("Dati un numar pt sir:");
            sir[i]=scanner.nextInt();
            scanner.nextLine();
        }

        int[] x=new int[sir.length/2];

        for(int i=0;i<(sir.length/2);i++){
            x[i]=(sir[i]*2);
        }
        int[] a=new int[sir.length/2];
        int[] b=new int[sir.length/2];
        int counter1=0;
        int counter2=0;
        for(int i=(sir.length/2);i<sir.length;i++){
            if(sir[i]%2==0){
                a[counter1]=sir[i];
                counter1++;
            }else{
                b[counter2]=(sir[i]*3);
                counter2++;
            }
        }
        System.out.println("Numerele (dublate) din prima jumatate a sirului sunt egale cu:");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        System.out.println("Din a doua jumatate a sirului, numelere impare (deci triplate) sunt:");

        for(int i=0;i<counter2;i++){
            System.out.println(b[i]);
        }
        System.out.println("Numele pare din a doua jumatate a sirului sunt egale cu:");
        for(int i=0;i<counter1;i++){
            System.out.println(a[i]);
        }



    }
}
