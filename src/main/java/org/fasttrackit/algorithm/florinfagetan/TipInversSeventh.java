package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class TipInversSeventh {
    public static void main(String[] args) {


        Scanner intrareTastatura = new Scanner(System.in);

        System.out.println("introduceti numarul de analizat: ");
        int nrDeAnalizat=intrareTastatura.nextInt();



        int nrCifre=0;
        int nrDepozit=nrDeAnalizat;


        while (nrDeAnalizat>0){
            int cifra=nrDeAnalizat%10;
            nrCifre++;
            nrDeAnalizat=nrDeAnalizat/10;
        }
        int nrInvers=0;
        while (nrDepozit>0){
            int cifra=nrDepozit%10;
            double indexb=cifra*Math.pow(10,nrCifre-1);
            nrCifre--;
            nrInvers +=indexb;
            nrDepozit=nrDepozit/10;
        }
        System.out.println("numarul cu cifre inversate este: "+nrInvers);




    }
}