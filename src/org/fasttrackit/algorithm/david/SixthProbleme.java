package org.fasttrackit.algorithm.david;


public class SixthProbleme {
    public static void main(String[] args) {
        int a = 765432;

        int x = a;
        int nrDeCifre = 0;
        int cifra = 0;
        int sumaCifrelor = 0;
        int produsulCifrelor = 1;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (x != 0) {
            cifra = x % 10;
            if (cifra < max) {
                max = cifra;
            }
            if (cifra > min) {
                min = cifra;
            }
            sumaCifrelor += cifra;
            produsulCifrelor *= cifra;
            x = x / 10;
            nrDeCifre++;
        }

        System.out.println("Numarul de cifre al numarului " + a + " este egal cu " + nrDeCifre);
        System.out.println("Suma cifrelor numarului " + a + " este egala cu " + sumaCifrelor);
        System.out.println("Produsul cifrelor numarului " + a + " este egal cu " + produsulCifrelor);
        System.out.println("Cea mai mica cifra a numarului " + a + " este egala cu " + max);
        System.out.println("Cea mai mare cifra a numarului " + a + " este egala cu " + min);


        int s=sumaCifrelor;

        while(s/10!=0){
            s=sumaCifrelor(s);
        }

        System.out.println("Numarul de control al numarului "+a+" este egal cu "+s);
    }
    private static int sumaCifrelor(int numar){
        int cifra=0;
        int suma=0;
        while(numar!=0){
            cifra=numar%10;
            suma+=cifra;
            numar/=10;
        }
        return suma;
    }
}
