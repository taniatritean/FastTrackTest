package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaOptsprezece {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dati numarul de numere:");
        int nrDeNr = scanner.nextInt();
        scanner.nextLine();
        if (nrDeNr == 1) {
            System.out.println("Sirul este crescator");
        } else {
            int[] sir = new int[nrDeNr];
            for (int i = 0; i < nrDeNr; i++) {
                System.out.println("Dati un numar pt sir:");
                sir[i] = scanner.nextInt();
                scanner.nextLine();
            }
            if(metoda(sir)==null){
                System.out.println("Sirul este deja crescator.");
            }else{
                for (int i = 0; i < nrDeNr; i++) {
                    sir.equals(metoda(sir));
                }


                System.out.println("Sirul crescator este egal cu :");
                for (int i = 0; i < nrDeNr; i++) {
                    System.out.println(sir[i]);
                }
            }
        }


    }


    private static int[] metoda(int sir[]) {
        int a;
        boolean x=false;
        for (int i = 1; i < sir.length; i++) {
            if (sir[i - 1] > sir[i]) {
                x =true;
                a = sir[i - 1];
                sir[i - 1] = sir[i];
                sir[i] = a;
            }
        }if(x) {
            return sir;
        }
        return null;
    }
}
