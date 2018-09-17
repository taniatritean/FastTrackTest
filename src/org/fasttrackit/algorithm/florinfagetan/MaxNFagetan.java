package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class MaxNFagetan {
    public static void main(String[] args) {
            Scanner intraretastatura = new Scanner(System.in);
            System.out.println("introduceti numarul n: ");
        int n = intraretastatura.nextInt();

        int[]numere = new int[n];
        int total = 0;
        int max = 0;
        for(int i=0; i < numere.length;i++){
            System.out.println("introduceti numarul " +(i+1)+ ":");
            numere[i]=intraretastatura.nextInt();
            total += numere[i];
            if(numere[i]>max) max=numere[i];
        }
System.out.println("media aritmetica este:" +(total/n));
        System.out.println("maximul celor " +n+ " numere este:" +max);

    }
}
