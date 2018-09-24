package org.fasttrackit.algorithm.florinfagetan;

import java.util.Arrays;
import java.util.Scanner;

public class SirCrescator {
    public static void main(String[] args) {
        Scanner intrareTastatura = new Scanner(System.in);
        System.out.println("introduceti numarul de elemente al sirului : ");
        int nrElem = intrareTastatura.nextInt();
        intrareTastatura.nextLine();
        int sirulMeu[] = new int[nrElem];
        for (int i = 0; i < nrElem; i++) {
            System.out.println("introduceti elementul cu numarul: " + (i + 1));
            sirulMeu[i] = intrareTastatura.nextInt();
        }
        System.out.println("sirul  este : " + Arrays.toString(sirulMeu));

        int i = 0;

        while (i <nrElem-1) {
            if(sirulMeu[i] < sirulMeu[i + 1])
            {
                i++;
                System.out.println("sirul este ordonat crescator");
                return;
                           }
            else{

                break;
           }
             }
        Arrays.sort(sirulMeu);
        System.out.println("sirul ordonat crescator  este : " + Arrays.toString(sirulMeu));
    }
}
