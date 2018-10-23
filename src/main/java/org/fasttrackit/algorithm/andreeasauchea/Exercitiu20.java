package org.fasttrackit.algorithm.andreeasauchea;
import java.util.Scanner;

public class Exercitiu20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sa se dea numarul de elemente: ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for(int i=0; i<nr; i++){
            System.out.println("Dati elementul: ");
            a[i] = scan.nextInt();
        }
        System.out.println("Dati valorile dintre care sa fie extrase numerele, in ordine crescatoare");
        int inf=scan.nextInt();
        int sup=scan.nextInt();
        int[] b = new int[nr];
        int j=0;
        for (int i=0; i<nr; i++){
            if (a[i]>inf && a[i]<sup){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println("Acesta este sirul: ");
        for(int i=0; i<j; i++){
            System.out.println(b[i]);
        }
    }
}
