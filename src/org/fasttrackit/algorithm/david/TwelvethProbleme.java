package org.fasttrackit.algorithm.david;

public class TwelvethProbleme {
    public static void main(String[] args) {
        int[] sir ={12, 34,35, 11,10,34,0};
        int min=Integer.MIN_VALUE;

        for(int i=0;i<sir.length;i++) {
            int s=sir[i];

            while(s/10!=0){
                s=sumaCifrelor(s);
            }
            System.out.println("Numarul de control al numarului "+sir[i]+" este egal cu " +s);

            if(sir[i]>min&&s<3){
                min=sir[i];
            }
        }
        System.out.println("Cea mai mare cifra cu numarul de control mai mic decat 3 este egala cu "+min);
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
