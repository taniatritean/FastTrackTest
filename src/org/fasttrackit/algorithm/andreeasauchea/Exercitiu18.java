package org.fasttrackit.algorithm.andreeasauchea;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Exercitiu18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul de elemente ale sirului: ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for (int i=0; i<nr; i++){
            System.out.println("Dati elementul: ");
            a[i] = scan.nextInt();
        }
        boolean crescator = true;
        int i=0;
        while(i<nr-1 && crescator){
            if (a[i]>a[i+1]){
                crescator = false;
            }
            i++;
        }
        if (crescator){
            System.out.println("Sirul este crescator.");
        } else {
            Arrays.sort(a);
            System.out.println("Sirul a fost ordonat.");
        }
        for (int j=0; j<nr; j++){
            System.out.println(a[j]);
        }
    }
}
