package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaDouazeci {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati numarul de numere:");
        int nrDeNr=scanner.nextInt();
        scanner.nextLine();
        int[] sir=new int[nrDeNr];
        for(int i=0;i<nrDeNr;i++){
            System.out.println("Dati un numar pt sir:");
            sir[i]=scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Veti da 2 valori intre care sa se afiseze (intre indexe, incepand de la 1 - prima valoare a sirului) valorile sirului anterior puse intr-un sir, dati prima:");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dati cea de a 2-a valoare:");
        int b=scanner.nextInt();
        scanner.nextLine();
        int c=0;
        if(a>b){
            c=a;
            a=b;
            b=c;
        }


            int[] sirNou=new int[(b-a)];
            int counter=0;
            for(int i=a;i<b;i++){
                sirNou[counter]=sir[i];
                counter++;
            }

            System.out.println(sir[a-1]);
            for(int i=0;i<sirNou.length;i++){
                System.out.println(sirNou[i]);
            }

    }
}
