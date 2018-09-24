package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class DiverseOperatiiCifreSixth {
    public static void main(String[] args) {


        Scanner intrareTastatura = new Scanner(System.in);

        System.out.println("introduceti numarul de analizat: ");
        int nrDeAnalizat=intrareTastatura.nextInt();
        int suma=0;
        int produs=1;
        int nrCifre=0;
        int maxn=0;
        int minn=9;

        while (nrDeAnalizat>0){
            int cifra=nrDeAnalizat%10;
            suma +=cifra;
            produs *=cifra;
            nrCifre++;

            if (maxn<cifra) {
                maxn = cifra;
            }
            if(minn>cifra){
                minn=cifra;
            }
                nrDeAnalizat = nrDeAnalizat / 10;

        }
        System.out.println("suma cifrelor este: "+suma);
        System.out.println("produsul cifrelor este: "+produs);
        System.out.println("numarul de cifre este: "+nrCifre);
        System.out.println("cifra maxima este: "+maxn);
        System.out.println("cifra minima este: "+minn);

    }
}